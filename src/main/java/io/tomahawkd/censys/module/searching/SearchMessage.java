package io.tomahawkd.censys.module.searching;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class SearchMessage<T> extends AbstractMessage {

	private String status;
	private List<T> results;
	private SearchMetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<T> getResults() {
		return results;
	}

	public SearchMetaDataMessage getMetadata() {
		return metadata;
	}

}
