package io.tomahawkd.censys.module.protocol.http;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.TypeAdapterRegister;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HeadersMessage extends AbstractMessage {

	private Map<String, String> headers = new HashMap<>();
	private Map<String, String> unknown = new HashMap<>();

	public Map<String, String> getHeaders() {
		return headers;
	}

	public Map<String, String> getUnknown() {
		return unknown;
	}

	private static class HeaderTypeAdapter extends TypeAdapter<HeadersMessage> {

		static {
			TypeAdapterRegister.getInstance().register(HeadersMessage.class, new HeaderTypeAdapter());
		}

		@Override
		public void write(JsonWriter out, HeadersMessage value) throws IOException {

			out.beginObject();

			if (!value.headers.isEmpty()) {
				for (Map.Entry<String, String> header : value.headers.entrySet()) {
					out.name(header.getKey()).value(header.getValue());
				}
			}

			out.name("unknown");
			out.beginArray();
			if (!value.unknown.isEmpty()) {
				for (Map.Entry<String, String> u : value.unknown.entrySet()) {
					out.beginObject();
					out.name(u.getKey()).value(u.getValue());
					out.endObject();
				}
			}
			out.endArray();

			out.endObject();
		}

		@Override
		public HeadersMessage read(JsonReader in) throws IOException {

			JsonToken token = in.peek();
			HeadersMessage message = new HeadersMessage();
			if (token.equals(JsonToken.BEGIN_OBJECT)) {
				in.beginObject();
				while (!in.peek().equals(JsonToken.END_OBJECT)) {
					if (in.peek().equals(JsonToken.NAME)) {
						String name = in.nextName();
						if (name.equals("unknown")) parseMapInList(message.unknown, in);
						else message.headers.put(name, in.nextString());
					}
				}
				in.endObject();
			}
			return message;
		}

		private void parseMapInList(Map<String, String> map, JsonReader in) throws IOException {
			if (in.peek().equals(JsonToken.BEGIN_ARRAY)) {
				in.beginArray();
				while (!in.peek().equals(JsonToken.END_ARRAY)) {
					if (in.hasNext()) {
						in.beginObject();
						map.put(in.nextName(), in.nextString());
					}
				}
				in.endArray();
			}
		}
	}
}
