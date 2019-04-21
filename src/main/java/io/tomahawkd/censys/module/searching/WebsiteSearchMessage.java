package io.tomahawkd.censys.module.searching;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.websites.WebsiteMessage;

public class WebsiteSearchMessage extends SearchMessage<WebsiteMessage> {

	public static WebsiteSearchMessage parse(String data) {
		return new GsonBuilder().create().fromJson(data, WebsiteSearchMessage.class);
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
