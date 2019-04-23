package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.http.HttpWwwMessage;

public class Port80Message extends io.tomahawkd.censys.module.port.Port80Message {

	@SerializedName("http_www")
	private HttpWwwMessage httpWww;

	public HttpWwwMessage getHttpWww() {
		return httpWww;
	}
}
