package io.tomahawkd.censys.module.protocol.ip;

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

	@Override
	public String toString() {
		return "IpAddressMessage{" +
				"begin='" + begin + '\'' +
				", cidr='" + cidr + '\'' +
				", end='" + end + '\'' +
				", mask='" + mask + '\'' +
				'}';
	}
}
