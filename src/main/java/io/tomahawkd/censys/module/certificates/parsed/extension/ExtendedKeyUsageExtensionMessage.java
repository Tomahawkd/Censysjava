package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.tomahawkd.censys.module.AbstractMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtendedKeyUsageExtensionMessage extends AbstractMessage {

	static GsonBuilder registerTypeAdapter(GsonBuilder builder) {
		return builder.registerTypeAdapter(ExtendedKeyUsageExtensionMessage.class, new KeyUsageTypeAdapter());
	}

	private List<String> keyUsages = new ArrayList<>();
	private List<String> unknown = new ArrayList<>();
	private List<String> value = new ArrayList<>();

	public List<String> getKeyUsages() {
		return keyUsages;
	}

	public List<String> getUnknown() {
		return unknown;
	}

	public List<String> getValue() {
		return value;
	}

	@Override
	public String toString() {
		return registerTypeAdapter(new GsonBuilder()).create().toJson(this);
	}

	private static class KeyUsageTypeAdapter extends TypeAdapter<ExtendedKeyUsageExtensionMessage> {

		@Override
		public void write(JsonWriter out, ExtendedKeyUsageExtensionMessage value) throws IOException {

			out.beginObject();

			if (!value.keyUsages.isEmpty()) {
				for (String keyUsage : value.keyUsages) {
					out.name(keyUsage).value(true);
				}
			}

			if (!value.unknown.isEmpty()) {
				out.name("unknown").beginArray();
				for (String s : value.unknown) {
					out.value(s);
				}
				out.endArray();
			}

			if (!value.value.isEmpty()) {
				out.name("value").beginArray();
				for (String s : value.value) {
					out.value(s);
				}
				out.endArray();
			}

			out.endObject();
		}

		@Override
		public ExtendedKeyUsageExtensionMessage read(JsonReader in) throws IOException {

			JsonToken token = in.peek();
			ExtendedKeyUsageExtensionMessage message = new ExtendedKeyUsageExtensionMessage();
			if (token.equals(JsonToken.BEGIN_OBJECT)) {
				in.beginObject();
				while (!in.peek().equals(JsonToken.END_OBJECT)) {
					if (in.peek().equals(JsonToken.NAME)) {
						String name = in.nextName();
						if (name.equals("unknown")) parseList(message.unknown, in);
						else if (name.equals("value")) parseList(message.value, in);
						else if (in.nextBoolean()) message.keyUsages.add(name);
					}
				}
				in.endObject();
			}
			return message;
		}

		private void parseList(List<String> list, JsonReader in) throws IOException {
			if (in.peek().equals(JsonToken.BEGIN_ARRAY)) {
				in.beginArray();
				while (!in.peek().equals(JsonToken.END_ARRAY)) {
					if (in.hasNext()) list.add(in.nextString());
				}
				in.endArray();
			}
		}
	}
}
