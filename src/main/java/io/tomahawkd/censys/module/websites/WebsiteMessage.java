package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.GenericModuleMessage;
import io.tomahawkd.censys.module.port.Port25Message;
import io.tomahawkd.censys.module.port.Port465Message;

public class WebsiteMessage extends GenericModuleMessage {

	@SerializedName("25")
	private Port25Message port25;
	@SerializedName("80")
	private Port80Message port80;
	@SerializedName("443")
	private Port443Message port443;
	@SerializedName("465")
	private Port465Message port465;

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

	public Port25Message getPort25() {
		return port25;
	}

	public Port465Message getPort465() {
		return port465;
	}
}
