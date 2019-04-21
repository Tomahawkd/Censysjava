package io.tomahawkd.censys.module.common;

public class IdValueMessage {

	private String id;
	private String value;

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "{" +
				"id='" + id + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
