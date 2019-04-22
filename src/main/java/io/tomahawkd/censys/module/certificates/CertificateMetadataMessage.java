package io.tomahawkd.censys.module.certificates;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.DateConverter;

import java.util.Date;

public class CertificateMetadataMessage extends AbstractMessage {

	@JsonAdapter(DateConverter.class)
	@SerializedName("added_at")
	private Date addedAt;
	@SerializedName("parse_error")
	private String parseError;
	@SerializedName("parse_status")
	private String parseStatus;
	@SerializedName("parse_version")
	private int parseVersion;
	@SerializedName("post_processed")
	private boolean postProcessed;
	@JsonAdapter(DateConverter.class)
	@SerializedName("post_processed_at")
	private Date postProcessedAt;
	@SerializedName("seen_in_scan")
	private boolean seenInScan;
	private String source;
	@JsonAdapter(DateConverter.class)
	@SerializedName("updated_at")
	private Date updatedAt;

	public Date getAddedAt() {
		return addedAt;
	}

	public String getParseError() {
		return parseError;
	}

	public String getParseStatus() {
		return parseStatus;
	}

	public int getParseVersion() {
		return parseVersion;
	}

	public boolean isPostProcessed() {
		return postProcessed;
	}

	public Date getPostProcessedAt() {
		return postProcessedAt;
	}

	public boolean isSeenInScan() {
		return seenInScan;
	}

	public String getSource() {
		return source;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
}
