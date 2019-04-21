package io.tomahawkd.censys.module.searching;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.ipv4.IpSearchResultMessage;

public class IpSearchMessage extends SearchMessage<IpSearchResultMessage> {

	public static IpSearchMessage parse(String data) {
		return IpSearchResultMessage.registerConverter(new GsonBuilder())
				.create().fromJson(data, IpSearchMessage.class);
	}

	@Override
	public String toString() {
		return IpSearchResultMessage.registerConverter(new GsonBuilder())
				.create().toJson(this);
	}
}
