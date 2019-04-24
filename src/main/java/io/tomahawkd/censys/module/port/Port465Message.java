package io.tomahawkd.censys.module.port;

import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.protocol.tls.TLSMessage;

public class Port465Message extends PortMessage {

	private SmtpMessage smtp;

	private class SmtpMessage extends AbstractMessage {
		private TLSMessage tls;
	}

	public TLSMessage getCotent() {
		return smtp.tls;
	}
}
