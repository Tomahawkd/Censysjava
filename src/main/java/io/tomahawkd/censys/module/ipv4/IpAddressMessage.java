package io.tomahawkd.censys.module.ipv4;

import io.tomahawkd.censys.module.AbstractMessage;

public class IpAddressMessage extends AbstractMessage {

	private String begin;
	private String cidr;
	private String end;
	private String mask;

	public String getBegin() {
		return begin;
	}

	public String getCidr() {
		return cidr;
	}

	public String getEnd() {
		return end;
	}

	public String getMask() {
		return mask;
	}
}
