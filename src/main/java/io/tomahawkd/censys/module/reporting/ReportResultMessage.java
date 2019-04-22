package io.tomahawkd.censys.module.reporting;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ReportResultMessage extends AbstractMessage {

	private String key;
	@SerializedName("doc_count")
	private int docCount;

	public String getKey() {
		return key;
	}

	public int getDocCount() {
		return docCount;
	}
}
