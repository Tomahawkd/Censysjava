package io.tomahawkd.censys.net;

import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.module.errors.AuthenticationErrorMessage;
import io.tomahawkd.censys.module.errors.ErrorMessage;
import io.tomahawkd.censys.module.errors.GenericErrorMessage;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Response<ExpectMessage extends Message> {

	private Status status;
	private ResponseMessage message;
	private Class<ExpectMessage> expectMessageClass;

	private Response(int status, String result, Class<ExpectMessage> clazz) {
		this.status = Status.fromCode(status);
		boolean isError = false;
		if (this.status != Status.OK) isError = true;
		this.expectMessageClass = clazz;

		try {

			Message contentMessage;
			if (isError) {
				if (this.status == Status.FORBIDDEN) {
					contentMessage = (Message) AuthenticationErrorMessage.class.getMethod("parse", String.class)
							.invoke(null, result);
				} else {
					contentMessage = (Message) GenericErrorMessage.class.getMethod("parse", String.class)
							.invoke(null, result);
				}
			} else {
				contentMessage = (Message) this.expectMessageClass.getMethod("parse", String.class)
						.invoke(null, result);
			}

			this.message = new ResponseMessage(contentMessage, isError);

		} catch (IllegalAccessException |
				InvocationTargetException |
				NoSuchMethodException |
				ClassCastException e) {
			throw new IllegalStateException(e.getCause());
		}
	}

	public static <T extends Message> Response<T>
	executeWithStatusCheckForClass(Class<T> clazz,
	                               String method,
	                               String target_url,
	                               @Nullable String token,
	                               @Nullable Map<String, String> param,
	                               String content) {

		try {
			return Response.executeWithAuthForClass(clazz, method, target_url, token, param, content);
		} catch (IOException e) {
			throw new IllegalStateException(e.getMessage());
		}
	}

	public static <T extends Message> Response<T>
	executeWithAuthForClass(Class<T> clazz,
	                        String method,
	                        String target_url,
	                        @Nullable String token,
	                        @Nullable Map<String, String> param,
	                        String content) throws IOException {

		StringBuilder target = new StringBuilder(target_url);
		if (param != null) {
			target.append("?");
			param.forEach((k, v) -> target.append(k).append("=").append(v).append("&"));
			target.deleteCharAt(target.length() - 1);
		}

		URL url = new URL(target.toString());

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(method);
		if (method.equals("POST")) {
			conn.setDoOutput(true);

			try (OutputStream os = conn.getOutputStream()) {
				byte[] input = content.getBytes(StandardCharsets.UTF_8);
				os.write(input, 0, input.length);
			}
		}

		if (token != null) {
			conn.addRequestProperty("Authorization", "Basic " + token);
		}
		conn.setConnectTimeout(2000);
		conn.setReadTimeout(2000);

		conn.connect();

		StringBuilder text = new StringBuilder();
		int responseCode = conn.getResponseCode();

		InputStreamReader in;
		if (responseCode == HttpURLConnection.HTTP_OK ||
				responseCode == HttpURLConnection.HTTP_ACCEPTED ||
				responseCode == HttpURLConnection.HTTP_CREATED) {
			in = new InputStreamReader(conn.getInputStream());
		} else {
			in = new InputStreamReader(conn.getErrorStream());
		}

		BufferedReader buff = new BufferedReader(in);
		String line = buff.readLine();
		while (line != null) {
			text.append(line).append("\n");
			line = buff.readLine();
		}

		return new Response<T>(responseCode, text.toString(), clazz);
	}

	public Status getStatus() {
		return status;
	}

	public ExpectMessage getExpectMessage() {
		return message.getExpectMessage(expectMessageClass);
	}

	public ErrorMessage getErrorMessage() {
		return message.getErrorMessage();
	}

	public boolean isError() {
		return message.isError();
	}

	public String getContentMessage() {
		return message.getContentMessage();
	}

	@Override
	public String toString() {
		return "Response{" +
				"status=" + status.statusCode +
				", content='\n" + getContentMessage() + "\n\'" +
				'}';
	}


	public enum Status {
		OK(200),
		BAD_REQUEST(400),
		FORBIDDEN(403),
		NOT_FOUND(404),
		RATE_LIMIT_EXCEEDED(429),
		INTERNAL_SERVER_ERROR(500),
		UNKNOWN(-1);

		private int statusCode;

		Status(int statusCode) {
			this.statusCode = statusCode;
		}

		public int code() {
			return statusCode;
		}

		public static Status fromCode(int statusCode) {
			switch (statusCode) {
				case 200:
					return OK;
				case 400:
					return BAD_REQUEST;
				case 403:
					return FORBIDDEN;
				case 404:
					return NOT_FOUND;
				case 429:
					return RATE_LIMIT_EXCEEDED;
				case 500:
					return INTERNAL_SERVER_ERROR;
				default:
					return UNKNOWN;
			}
		}
	}
}
