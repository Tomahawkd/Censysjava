package io.tomahawkd.censys.module.errors;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class AuthenticationErrorMessage extends ErrorMessage {

	public static AuthenticationErrorMessage parse(String data) {
		return new GsonBuilder().create()
				.fromJson(data, AuthenticationErrorMessage.class);
	}

	private String status;
	@SerializedName("error_type")
	private String errorType;
	@SerializedName("error")
	private String errorMessge;

	public String getStatus() {
		return status;
	}

	public String getErrorType() {
		return errorType;
	}

	@Override
	public String getErrorMessage() {
		return errorMessge;
	}
}
