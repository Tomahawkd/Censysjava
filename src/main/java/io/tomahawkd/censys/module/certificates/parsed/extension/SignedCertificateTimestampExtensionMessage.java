package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.Date;

public class SignedCertificateTimestampExtensionMessage extends AbstractMessage {

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
}
