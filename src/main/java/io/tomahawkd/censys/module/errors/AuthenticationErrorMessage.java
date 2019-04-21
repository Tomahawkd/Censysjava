package io.tomahawkd.censys.module.errors;

import com.google.gson.annotations.SerializedName;

public class AuthenticationErrorMessage extends ErrorMessage {

	private String status;
	@SerializedName("error_type")
	private String errorType;
	@SerializedName("error")
	private String errorMessage;

	public String getStatus() {
		return status;
	}

	public String getErrorType() {
		return errorType;
	}

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
}
