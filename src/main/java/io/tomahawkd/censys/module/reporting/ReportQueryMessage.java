package io.tomahawkd.censys.module.reporting;

import io.tomahawkd.censys.module.AbstractMessage;

public class ReportQueryMessage extends AbstractMessage {

	private String query;
	private String field;
	private int buckets;

	public ReportQueryMessage(String query, String field, int buckets) {
		this.query = query;
		this.field = field;
		this.buckets = buckets;
	}

	public String getQuery() {
		return query;
	}

	public String getField() {
		return field;
	}

	public int getBuckets() {
		return buckets;
	}
}
