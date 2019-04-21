package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.DateConverter;

import java.util.Date;

public class CertificateValidityMessage extends AbstractMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return builder.registerTypeAdapter(Date.class, new DateConverter());
	}

	private Date start;
	private Date end;
	private long length;

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public long getLength() {
		return length;
	}

	@Override
	public String toString() {
		return CertificateValidityMessage.registerConverter(new GsonBuilder()).create().toJson(this);
	}
}
