package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class BasicConstraintsExtensionMessage extends AbstractMessage {

	@SerializedName("is_ca")
	private boolean ca;
	@SerializedName("max_path_len")
	private int maxPathLength;

	public boolean isCa() {
		return ca;
	}

	public int getMaxPathLength() {
		return maxPathLength;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
