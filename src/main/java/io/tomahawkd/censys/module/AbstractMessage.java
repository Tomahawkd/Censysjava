package io.tomahawkd.censys.module;

public class AbstractMessage implements Message {
	@Override
	public String getMessage() {
		return toString();
	}
}
