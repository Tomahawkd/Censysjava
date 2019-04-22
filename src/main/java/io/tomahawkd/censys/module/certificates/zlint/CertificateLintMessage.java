package io.tomahawkd.censys.module.certificates.zlint;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.tomahawkd.censys.module.AbstractMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonAdapter(CertificateLintMessage.LintTypeAdapter.class)
public class CertificateLintMessage extends AbstractMessage {

	private List<String> lints = new ArrayList<>();

	public List<String> getLints() {
		return lints;
	}

	class LintTypeAdapter extends TypeAdapter<CertificateLintMessage> {

		@Override
		public void write(JsonWriter out, CertificateLintMessage value) throws IOException {

			out.beginObject();

			if (!value.lints.isEmpty()) {
				for (String keyUsage : value.lints) {
					out.name(keyUsage).value(true);
				}
			}
			out.endObject();
		}

		@Override
		public CertificateLintMessage read(JsonReader in) throws IOException {

			JsonToken token = in.peek();
			CertificateLintMessage message = new CertificateLintMessage();
			if (token.equals(JsonToken.BEGIN_OBJECT)) {
				in.beginObject();
				while (!in.peek().equals(JsonToken.END_OBJECT)) {
					if (in.peek().equals(JsonToken.NAME)) {
						String name = in.nextName();
						if (in.nextBoolean()) message.lints.add(name);
					}
				}
				in.endObject();
			}
			return message;
		}
	}
}
