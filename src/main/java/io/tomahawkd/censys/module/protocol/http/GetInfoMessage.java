package io.tomahawkd.censys.module.protocol.http;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.BasicInfoMessage;

public class GetInfoMessage extends BasicInfoMessage {

	private String body;
	@SerializedName("body_sha256")
	private String bodySHA256;
	private HeadersMessage headers;
	@SerializedName("status_code")
	private int statusCode;
	@SerializedName("status_line")
	private String statusLine;
	private String title;

	public String getBody() {
		return body;
	}

	public String getBodySHA256() {
		return bodySHA256;
	}

	public HeadersMessage getHeaders() {
		return headers;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getStatusLine() {
		return statusLine;
	}

	public String getTitle() {
		return title;
	}
}
