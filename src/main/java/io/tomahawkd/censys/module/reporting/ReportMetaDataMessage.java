package io.tomahawkd.censys.module.reporting;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ReportMetaDataMessage extends AbstractMessage {

	private int count;
	private String query;
	@SerializedName("backend_time")
	private int usedTime;
	@SerializedName("nonnull_count")
	private int nonNullCount;
	@SerializedName("other_result_count")
	private int otherResultCount;
	private int buckets;
	@SerializedName("error_bound")
	private int errorBound;

	public int getCount() {
		return count;
	}

	public String getQuery() {
		return query;
	}

	public int getUsedTime() {
		return usedTime;
	}

	public int getNonNullCount() {
		return nonNullCount;
	}

	public int getOtherResultCount() {
		return otherResultCount;
	}

	public int getBuckets() {
		return buckets;
	}

	public int getErrorBound() {
		return errorBound;
	}
}
