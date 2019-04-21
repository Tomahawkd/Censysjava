package io.tomahawkd.censys.module.certificates;

import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.ParsedCertificateMessage;

public class CertificateMessage extends AbstractMessage {

	private ParsedCertificateMessage parsed;
	private CertificateValidationMessage validation;

	public ParsedCertificateMessage getParsed() {
		return parsed;
	}

	public CertificateValidationMessage getValidation() {
		return validation;
	}

}
