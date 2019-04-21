package io.tomahawkd.censys.module.certificates.parsed;

import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateAlgorithmMessage extends AbstractMessage {

	private String oid;
	private String name;

	public String getOid() {
		return oid;
	}

	public String getName() {
		return name;
	}
}
