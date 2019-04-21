package io.tomahawkd.censys.module.searching;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.certificates.CertificateMessage;

public class CertSearchMessage extends SearchMessage<CertificateMessage> {

	public static CertSearchMessage parse(String data) {
		return CertificateMessage.registerConverter(new GsonBuilder()).create()
				.fromJson(data, CertSearchMessage.class);
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
