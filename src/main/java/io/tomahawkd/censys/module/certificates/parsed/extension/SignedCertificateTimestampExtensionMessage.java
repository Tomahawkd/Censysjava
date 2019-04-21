package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.DateConverter;

import java.util.Date;

public class SignedCertificateTimestampExtensionMessage extends AbstractMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return builder.registerTypeAdapter(Date.class, new DateConverter());
	}

	private String extensions;
	@SerializedName("log_id")
	private String logId;
	private String signature;
	private Date timestamp;
	private short version;

	public String getExtensions() {
		return extensions;
	}

	public String getLogId() {
		return logId;
	}

	public String getSignature() {
		return signature;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public short getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return registerConverter(new GsonBuilder()).create().toJson(this);
	}
}
