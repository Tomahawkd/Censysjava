package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class SessionTicketMessage extends AbstractMessage {

	private int length;
	@SerializedName("lifetime_hint")
	private long lifetimeHint;
	private String value;

	public int getLength() {
		return length;
	}

	public long getLifetimeHint() {
		return lifetimeHint;
	}

	public String getValue() {
		return value;
	}
}
