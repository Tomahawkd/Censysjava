package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import io.tomahawkd.censys.module.AbstractMessage;

public class KeyParamFragmentMessage extends AbstractMessage {

	private int length;
	private String value;

	public int getLength() {
		return length;
	}

	public String getValue() {
		return value;
	}
}
