package io.tomahawkd.censys.module.port;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.protocol.http.HttpMessage;
import io.tomahawkd.censys.module.protocol.http.HttpWwwMessage;

public class Port80Message extends AbstractMessage {

	private HttpMessage http;
	@SerializedName("http_www")
	private HttpWwwMessage httpWww;


	public HttpMessage getHttp() {
		return http;
	}

	public HttpWwwMessage getHttpWww() {
		return httpWww;
	}
}
