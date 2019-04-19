package io.tomahawkd.censys.module.errors;

import io.tomahawkd.censys.module.AbstractMessage;

public abstract class ErrorMessage extends AbstractMessage {

	abstract String getErrorMessage();

	@Override
	public String toString() {
		return getErrorMessage();
	}
}
