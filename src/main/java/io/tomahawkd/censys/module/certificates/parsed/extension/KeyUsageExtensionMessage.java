package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.tomahawkd.censys.module.AbstractMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonAdapter(KeyUsageExtensionMessage.KeyUsageTypeAdapter.class)
public class KeyUsageExtensionMessage extends AbstractMessage {

	private List<String> keyUsages = new ArrayList<>();
	private int value = -1;

	public List<String> getKeyUsages() {
		return keyUsages;
	}

	public int getValue() {
		return value;
	}

	class KeyUsageTypeAdapter extends TypeAdapter<KeyUsageExtensionMessage> {

		@Override
		public void write(JsonWriter out, KeyUsageExtensionMessage value) throws IOException {

			out.beginObject();

			if (!value.keyUsages.isEmpty()) {
				for (String keyUsage : value.keyUsages) {
					out.name(keyUsage).value(true);
				}
			}

			if (value.value != -1) out.name("value").value(value.value);

			out.endObject();
		}

		@Override
		public KeyUsageExtensionMessage read(JsonReader in) throws IOException {

			JsonToken token = in.peek();
			KeyUsageExtensionMessage message = new KeyUsageExtensionMessage();
			if (token.equals(JsonToken.BEGIN_OBJECT)) {
				in.beginObject();
				while (!in.peek().equals(JsonToken.END_OBJECT)) {
					if (in.peek().equals(JsonToken.NAME)) {
						String name = in.nextName();
						if (name.equals("value")) message.value = in.nextInt();
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
