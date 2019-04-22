package io.tomahawkd.censys.module.reporting;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ReportResultMessage<KeyType> extends AbstractMessage {

	private KeyType key;
	@SerializedName("doc_count")
	private int docCount;

	public KeyType getKey() {
		return key;
	}

	public int getDocCount() {
		return docCount;
	}
}
