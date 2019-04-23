package io.tomahawkd.censys.module.certificates.ct;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.JsonConverter;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@JsonAdapter(CtsMessage.CTConverter.class)
public class CtsMessage extends AbstractMessage {

	private Map<String, CertificateTransparencyMessage> cts = new HashMap<>();

	public Map<String, CertificateTransparencyMessage> getCts() {
		return cts;
	}

	class CTConverter implements JsonConverter<CtsMessage> {
		@Override
		public CtsMessage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			CtsMessage message = new CtsMessage();
			JsonObject object = json.getAsJsonObject();
			object.keySet().forEach(k -> message.cts.put(k, new GsonBuilder().create().fromJson(object.get(k),
							CertificateTransparencyMessage.class)));
			return message;
		}

		@Override
		public JsonElement serialize(CtsMessage src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject object = new JsonObject();
			src.cts.forEach((k,v) -> object.add(k, context.serialize(v, CertificateTransparencyMessage.class)));
			return object;
		}
	}
}
