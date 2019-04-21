package io.tomahawkd.censys.module.searching;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class SearchQueryMessage extends AbstractMessage {

	private String query;
	private int page;
	private List<String> fields;
	private boolean flatten = false;

	public SearchQueryMessage(String query, int page, List<String> fields) {
		this.query = query;
		this.page = page;
		this.fields = fields;
	}

	public String getQuery() {
		return query;
	}

	public int getPage() {
		return page;
	}

	public List<String> getFields() {
		return fields;
	}
}
