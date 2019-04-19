package io.tomahawkd.censys.module.ipv4;

import com.google.gson.*;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.JsonConverter;

import java.lang.reflect.Type;

public class ProtocolMessage extends AbstractMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return builder.registerTypeAdapter(ProtocolMessage.class, new ProtocolConverter());
	}

	private int port;
	private String service;

	private ProtocolMessage(int port, String service) {
		this.port = port;
		this.service = service;
	}

	public int getPort() {
		return port;
	}

	public String getService() {
		return service;
	}

	@Override
	public String toString() {
		return "ProtocolMessage{" +
				"port=" + port +
				", service='" + service + '\'' +
				'}';
	}

	static class ProtocolConverter implements JsonConverter<ProtocolMessage> {

		@Override
		public ProtocolMessage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			String result = json.getAsString().replace("\"", "");
			String[] l = result.split("/");
			return new ProtocolMessage(Integer.parseInt(l[0]), l[1]);
		}

		@Override
		public JsonElement serialize(ProtocolMessage src, Type typeOfSrc, JsonSerializationContext context) {
			return context.serialize(src.port + "/" + src.service);
		}
	}
}

