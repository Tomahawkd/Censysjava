package io.tomahawkd.censys.module.certificates;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.ParsedCertificateMessage;

public class CertificateMessage extends AbstractMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return ParsedCertificateMessage.registerConverter(builder);
	}

	private ParsedCertificateMessage parsed;

	public ParsedCertificateMessage getParsed() {
		return parsed;
	}

	@Override
	public String toString() {
		return parsed.toString();
	}
}
