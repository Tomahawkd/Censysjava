package io.tomahawkd.censys.net;

import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.module.errors.ErrorMessage;
import org.jetbrains.annotations.Nullable;

public class ResponseMessage {

	private Message message;
	private boolean isError;

	ResponseMessage(Message message, boolean isError) {
		this.message = message;
		this.isError = isError;
	}

	@Nullable
	public <T extends Message> T getExpectMessage(Class<T> clazz) {

		if (isError) return null;

		try {
			return clazz.cast(message);
		} catch (ClassCastException e) {
			return null;
		}
	}

	public boolean isError() {
		return isError;
	}

	public ErrorMessage getErrorMessage() {
		if (isError) return (ErrorMessage) message;
		else return null;
	}

	public String getContentMessage() {
		return message.getMessage();
	}
}
