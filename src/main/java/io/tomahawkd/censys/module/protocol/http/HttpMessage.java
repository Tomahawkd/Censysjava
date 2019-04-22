package io.tomahawkd.censys.module.protocol.http;

import io.tomahawkd.censys.module.AbstractMessage;

public class HttpMessage extends AbstractMessage {

	private GetInfoMessage get;

	public GetInfoMessage get() {
		return get;
	}
}
