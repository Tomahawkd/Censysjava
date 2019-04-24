package io.tomahawkd.censys.module.port;

import io.tomahawkd.censys.module.protocol.smtp.SmtpMessage;

public class Port25Message extends PortMessage {

	private SmtpMessage smtp;

	public SmtpMessage getSmtp() {
		return smtp;
	}
}
