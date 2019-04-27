package io.tomahawkd.censys.exception;

import io.tomahawkd.censys.module.errors.ErrorMessage;

public class CensysException extends RuntimeException {

	private ErrorMessage errorMessage;

	public CensysException() {
		super();
	}

	public CensysException(String message) {
		super(message);
	}

	public CensysException(Throwable cause) {
		super(cause);
	}

	public CensysException(ErrorMessage errorMessage) {
		super(errorMessage.getMessage());
		this.errorMessage = errorMessage;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

}
