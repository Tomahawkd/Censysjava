package io.tomahawkd.censys.module.ipv4;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.JsonConverter;
import io.tomahawkd.censys.module.util.TypeAdapterRegister;

import java.lang.reflect.Type;

public class ProtocolMessage extends AbstractMessage {

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

	static class ProtocolConverter implements JsonConverter<ProtocolMessage> {

		static {
			TypeAdapterRegister.getInstance().register(ProtocolMessage.class, new ProtocolConverter());
		}

		@Override
		public ProtocolMessage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
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

