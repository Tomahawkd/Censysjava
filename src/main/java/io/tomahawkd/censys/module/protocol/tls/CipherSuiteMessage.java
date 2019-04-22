package io.tomahawkd.censys.module.protocol.tls;

import io.tomahawkd.censys.module.AbstractMessage;

public class CipherSuiteMessage extends AbstractMessage {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
