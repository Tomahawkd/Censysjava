package io.tomahawkd.censys.module.certificates;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.ParsedCertificateMessage;

public class CertificateMessage extends AbstractMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return ParsedCertificateMessage.registerConverter(builder);
	}

	private ParsedCertificateMessage parsed;
	private CertificateValidationMessage validation;

	public ParsedCertificateMessage getParsed() {
		return parsed;
	}

	public CertificateValidationMessage getValidation() {
		return validation;
	}

	@Override
	public String toString() {
		return parsed.toString();
	}
}
