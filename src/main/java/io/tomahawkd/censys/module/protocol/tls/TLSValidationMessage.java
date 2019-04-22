package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class TLSValidationMessage extends AbstractMessage {

	@SerializedName("browser_error")
	private String browserError;
	@SerializedName("browser_trusted")
	private boolean browserTrusted;
	@SerializedName("matches_domain")
	private boolean matchedDomain;

	public String getBrowserError() {
		return browserError;
	}

	public boolean isBrowserTrusted() {
		return browserTrusted;
	}

	public boolean isMatchedDomain() {
		return matchedDomain;
	}
}
