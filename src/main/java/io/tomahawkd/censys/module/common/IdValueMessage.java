package io.tomahawkd.censys.module.common;

import io.tomahawkd.censys.module.AbstractMessage;

public class IdValueMessage extends AbstractMessage {

	private String id;
	private String value;

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
}
