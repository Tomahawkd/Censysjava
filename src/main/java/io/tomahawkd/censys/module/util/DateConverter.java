package io.tomahawkd.censys.module.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements JsonConverter<Date> {

	static {
		TypeAdapterRegister.getInstance().register(Date.class, new DateConverter());
	}

	@Override
	public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = json.getAsString().replace("\"", "");
		try {
			return formatter.parse(json.getAsString());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return context.serialize(formatter.format(src));
	}
}
