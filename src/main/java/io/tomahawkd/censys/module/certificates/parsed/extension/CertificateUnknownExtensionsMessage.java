package io.tomahawkd.censys.module.certificates.parsed.extension;

import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateUnknownExtensionsMessage extends AbstractMessage {

	private boolean critical;
	private String id;
	private String value;

	public boolean isCritical() {
		return critical;
	}

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

}
