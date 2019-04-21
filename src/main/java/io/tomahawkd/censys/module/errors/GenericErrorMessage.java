package io.tomahawkd.censys.module.errors;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class GenericErrorMessage extends ErrorMessage {

	public static GenericErrorMessage parse(String data) {
		return new GsonBuilder().create()
				.fromJson(data, GenericErrorMessage.class);
	}

	private String status;
	@SerializedName("error_type")
	private String errorType;
	@SerializedName("error_code")
	private int errorCode;
	@SerializedName("error")
	private String errorMessage;

	public String getStatus() {
		return status;
	}

	public String getErrorType() {
		return errorType;
	}

	public int getErrorCode() {
		return errorCode;
	}

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
}
