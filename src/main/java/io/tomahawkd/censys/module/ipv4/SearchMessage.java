package io.tomahawkd.censys.module.ipv4;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class SearchMessage extends AbstractMessage {

	public static SearchMessage parse(String data) {
		return SearchResultMessage.registerConverter(new GsonBuilder())
				.create().fromJson(data, SearchMessage.class);
	}

	private String status;
	private List<SearchResultMessage> results;
	private MetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<SearchResultMessage> getResults() {
		return results;
	}

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	@Override
	public String toString() {
		return SearchResultMessage.registerConverter(new GsonBuilder())
				.create().toJson(this);
	}
}
