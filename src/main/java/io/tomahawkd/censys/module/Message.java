package io.tomahawkd.censys.module;

public interface Message {

	Message parse(String data);

	String getMessage();

	String buildJson();
}
