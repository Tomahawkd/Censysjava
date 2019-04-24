package io.tomahawkd.censys.module.protocol.smtp;

import io.tomahawkd.censys.module.AbstractMessage;

public class SmtpMessage extends AbstractMessage {

	private StarttlsMessage starttls;

	public StarttlsMessage getStarttls() {
		return starttls;
	}
}
