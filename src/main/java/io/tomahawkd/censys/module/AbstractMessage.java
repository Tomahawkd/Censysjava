package io.tomahawkd.censys.module;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.util.TypeAdapterRegister;
import org.jetbrains.annotations.Contract;

import java.lang.reflect.Field;

public abstract class AbstractMessage implements Message {

	private transient GsonBuilder builder = new GsonBuilder();

	public Message parse(String data) {
		register(builder);
		return builder.create().fromJson(data, this.getClass());
	}

	@Contract("_ -> param1")
	private GsonBuilder register(GsonBuilder builder) {
		Field[] fields = this.getClass().getFields();
		for (Field field : fields) {
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
		return toString();
	}

	@Override
	public String getMessage() {
		return toString();
	}

	@Override
	public String toString() {
		return register(new GsonBuilder()).create().toJson(this);
	}
}
