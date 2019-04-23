package io.tomahawkd.censys.module.port;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.https.HttpsMessage;
import io.tomahawkd.censys.module.protocol.https.HttpsWwwMessage;

public class Port443Message {

	private HttpsMessage https;
	@SerializedName("https_www")
	private HttpsWwwMessage httpsWww;

	public HttpsMessage getHttps() {
		return https;
	}

	public HttpsWwwMessage getHttpsWww() {
		return httpsWww;
	}
}
