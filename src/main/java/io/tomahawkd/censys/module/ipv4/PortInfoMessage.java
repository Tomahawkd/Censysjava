package io.tomahawkd.censys.module.ipv4;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.annotations.JsonAdapter;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.JsonConverter;

import java.lang.reflect.Type;

@JsonAdapter(PortInfoMessage.ProtocolConverter.class)
public class PortInfoMessage extends AbstractMessage {

	private int port;
	private String service;

	private PortInfoMessage(int port, String service) {
		this.port = port;
		this.service = service;
	}

	public int getPort() {
		return port;
	}

	public String getService() {
		return service;
	}

	class ProtocolConverter implements JsonConverter<PortInfoMessage> {

		@Override
		public PortInfoMessage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			String result = json.getAsString().replace("\"", "");
			String[] l = result.split("/");
			return new PortInfoMessage(Integer.parseInt(l[0]), l[1]);
		}

		@Override
		public JsonElement serialize(PortInfoMessage src, Type typeOfSrc, JsonSerializationContext context) {
			return context.serialize(src.port + "/" + src.service);
		}
	}
}

