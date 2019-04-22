package io.tomahawkd.censys.module;

import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public abstract class AbstractMessage implements Message {

	public Message parse(String data) {
		return parse(data, this.getClass());
	}

	public Message parse(String data, Type expectClass) {
		return new GsonBuilder().create().fromJson(data, expectClass);
	}

	@Override
	public String buildJson() {
		return new GsonBuilder().create().toJson(this);
	}

	@Override
	public String getMessage() {
		return toString();
	}

	@Override
	public String toString() {
		return buildJson();
	}
}
