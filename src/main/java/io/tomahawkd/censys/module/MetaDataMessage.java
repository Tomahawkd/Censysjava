package io.tomahawkd.censys.module;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class MetaDataMessage extends AbstractMessage {

	private int count;
	private String query;
	@SerializedName("backend_time")
	private int usedTime;
	@SerializedName("page")
	private int currentPage;
	@SerializedName("pages")
	private int allPage;

	public int getCount() {
		return count;
	}

	public String getQuery() {
		return query;
	}

	public int getUsedTime() {
		return usedTime;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getAllPage() {
		return allPage;
	}

	@Override
	public String toString() {
		return "MetaDataMessage{" +
				"count=" + count +
				", query='" + query + '\'' +
				", usedTime=" + usedTime +
				", currentPage=" + currentPage +
				", allPage=" + allPage +
				'}';
	}
}
