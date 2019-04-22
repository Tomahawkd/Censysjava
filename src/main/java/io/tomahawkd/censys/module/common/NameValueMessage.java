package io.tomahawkd.censys.module.common;

import io.tomahawkd.censys.module.AbstractMessage;

public class NameValueMessage extends AbstractMessage {

	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
}
