package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
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

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
