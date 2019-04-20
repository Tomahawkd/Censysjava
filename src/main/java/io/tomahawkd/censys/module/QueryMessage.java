package io.tomahawkd.censys.module;

import com.google.gson.GsonBuilder;

import java.util.List;

public class QueryMessage extends AbstractMessage {

	private String query;
	private int page;
	private List<String> fields;
	private boolean flatten = false;

	public QueryMessage(String query, int page, List<String> fields) {
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

	public String buildJson() {
		return new GsonBuilder().create().toJson(this);
	}

	@Override
	public String toString() {
		return buildJson();
	}
}
