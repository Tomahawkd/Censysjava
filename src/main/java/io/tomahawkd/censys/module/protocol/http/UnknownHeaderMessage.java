package io.tomahawkd.censys.module.protocol.http;

import io.tomahawkd.censys.module.AbstractMessage;

public class UnknownHeaderMessage extends AbstractMessage {

	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
