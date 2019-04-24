package io.tomahawkd.censys.module.protocol.smtp;

import io.tomahawkd.censys.module.common.BasicInfoMessage;
import io.tomahawkd.censys.module.protocol.tls.TLSMessage;

public class StarttlsMessage extends BasicInfoMessage {

	private String banner;
	private String ehlo;
	private String starttls;
	private TLSMessage tls;

	public String getBanner() {
		return banner;
	}

	public String getEhlo() {
		return ehlo;
	}

	public String getStarttls() {
		return starttls;
	}

	public TLSMessage getTls() {
		return tls;
	}
}
