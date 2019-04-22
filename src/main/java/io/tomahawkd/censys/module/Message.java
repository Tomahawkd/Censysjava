package io.tomahawkd.censys.module;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Contract;

public interface Message {

	Message parse(String data);

	String getMessage();

	String buildJson();
}
