package io.tomahawkd.censys.module;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.util.TypeAdapterRegister;
import org.jetbrains.annotations.Contract;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class AbstractMessage implements Message {

	private transient GsonBuilder builder;

	AbstractMessage() {
		builder = register(new GsonBuilder());
	}

	public Message parse(String data) {
		return builder.create().fromJson(data, this.getClass());
	}

	@Contract("_ -> param1")
	private GsonBuilder register(GsonBuilder builder) {
		Field[] fields = this.getClass().getFields();
		for (Field field : fields) {
			if (Modifier.isTransient(field.getModifiers())) continue;
			Class type = field.getType();
			if (AbstractMessage.class.isAssignableFrom(type)) {
				try {
					((AbstractMessage) field.getType().newInstance()).register(builder);
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} else if (TypeAdapterRegister.getInstance().isRegistered(type)) {
				TypeAdapterRegister.getInstance().registerToBuilder(builder, type);
			}
		}

		return builder;
	}

	@Override
	public String buildJson() {
		return builder.create().toJson(this);
	}

	@Override
	public String getMessage() {
		return toString();
	}

	@Override
	public String toString() {
		return buildJson();
	}
}
