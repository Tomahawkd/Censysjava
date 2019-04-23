package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.GenericModuleMessage;

public class WebsiteMessage extends GenericModuleMessage {


	@SerializedName("80")
	private Port80Message port80;
	@SerializedName("443")
	private Port443Message port443;

	@SerializedName("alexa_rank")
	private int rank;
	private String domain;

	public String getDomain() {
		return domain;
	}

	public int getRank() {
		return rank;
	}

	public Port80Message getPort80() {
		return port80;
	}

	public Port443Message getPort443() {
		return port443;
	}
}
