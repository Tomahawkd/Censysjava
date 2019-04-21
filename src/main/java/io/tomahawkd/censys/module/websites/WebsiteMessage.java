package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class WebsiteMessage extends AbstractMessage {

	private String domain;
	@SerializedName("alexa_rank")
	private int rank;

	public String getDomain() {
		return domain;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "{" +
				"domain='" + domain + '\'' +
				", rank=" + rank +
				'}';
	}
}
