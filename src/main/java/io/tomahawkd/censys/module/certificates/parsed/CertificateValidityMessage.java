package io.tomahawkd.censys.module.certificates.parsed;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.Date;

public class CertificateValidityMessage extends AbstractMessage {

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
}
