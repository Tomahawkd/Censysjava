package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.GenericModuleMessage;

public class WebsiteMessage extends GenericModuleMessage {

	@SerializedName("alexa_rank")
	private int rank;
	private String domain;

	public String getDomain() {
		return domain;
	}

	public int getRank() {
		return rank;
	}

}
