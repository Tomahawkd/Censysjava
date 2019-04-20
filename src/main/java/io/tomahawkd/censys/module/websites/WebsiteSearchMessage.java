package io.tomahawkd.censys.module.websites;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.MetaDataMessage;

import java.util.List;

public class WebsiteSearchMessage extends AbstractMessage {

	public static WebsiteSearchMessage parse(String data) {
		return new GsonBuilder().create().fromJson(data, WebsiteSearchMessage.class);
	}

	private String status;
	private List<Result> results;
	private MetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<Result> getResults() {
		return results;
	}

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}

	public class Result {

		private String domain;
		@SerializedName("alexa_rank")
		private int rank;

		public String getDomain() {
			return domain;
		}

		public int getRank() {
			return rank;
		}

		@Override
		public String toString() {
			return "Result{" +
					"domain='" + domain + '\'' +
					", rank=" + rank +
					'}';
		}
	}
}
