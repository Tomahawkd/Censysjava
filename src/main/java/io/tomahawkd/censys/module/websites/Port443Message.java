package io.tomahawkd.censys.module.websites;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.https.HttpsWwwMessage;

public class Port443Message extends io.tomahawkd.censys.module.port.Port443Message {

	@SerializedName("https_www")
	private HttpsWwwMessage httpsWww;

	public HttpsWwwMessage getHttpsWww() {
		return httpsWww;
	}
}
