package io.tomahawkd.censys.module.ipv4;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.MetaDataMessage;

import java.util.List;

public class IpSearchMessage extends AbstractMessage {

	public static IpSearchMessage parse(String data) {
		return IpSearchResultMessage.registerConverter(new GsonBuilder())
				.create().fromJson(data, IpSearchMessage.class);
	}

	private String status;
	private List<IpSearchResultMessage> results;
	private MetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<IpSearchResultMessage> getResults() {
		return results;
	}

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	@Override
	public String toString() {
		return IpSearchResultMessage.registerConverter(new GsonBuilder())
				.create().toJson(this);
	}
}
