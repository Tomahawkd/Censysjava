package io.tomahawkd.censys.module.certificates.ct;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.DateConverter;

import java.util.Date;

public class CertificateTransparencyMessage extends AbstractMessage {

	@JsonAdapter(DateConverter.class)
	@SerializedName("added_to_ct_at")
	private Date addedToCTAt;
	@JsonAdapter(DateConverter.class)
	@SerializedName("censys_to_ct_at")
	private Date censysToCTAt;
	@JsonAdapter(DateConverter.class)
	@SerializedName("ct_to_censys_at")
	private Date ctToCensysAt;
	private long index;
	private String sct;

	public Date getAddedToCTAt() {
		return addedToCTAt;
	}

	public Date getCensysToCTAt() {
		return censysToCTAt;
	}

	public Date getCtToCensysAt() {
		return ctToCensysAt;
	}

	public long getIndex() {
		return index;
	}

	public String getSct() {
		return sct;
	}
}
