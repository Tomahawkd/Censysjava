package io.tomahawkd.censys.module.port;

import io.tomahawkd.censys.module.protocol.http.HttpMessage;

public class Port80Message extends PortMessage {

	private HttpMessage http;

	public HttpMessage getHttp() {
		return http;
	}
}
