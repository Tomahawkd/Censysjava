package io.tomahawkd.censys.module.port;

import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.protocol.http.HttpMessage;

public class Port80Message extends AbstractMessage {

	private HttpMessage http;

	public HttpMessage getHttp() {
		return http;
	}
}
