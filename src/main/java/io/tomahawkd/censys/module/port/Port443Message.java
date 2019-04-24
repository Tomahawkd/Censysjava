package io.tomahawkd.censys.module.port;

import io.tomahawkd.censys.module.protocol.https.HttpsMessage;

public class Port443Message extends PortMessage {

	private HttpsMessage https;

	public HttpsMessage getHttps() {
		return https;
	}
}
