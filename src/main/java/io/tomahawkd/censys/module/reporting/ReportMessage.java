package io.tomahawkd.censys.module.reporting;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class ReportMessage<KeyType> extends AbstractMessage {

	private String status;
	private List<ReportResultMessage> results;
	private ReportMetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<ReportResultMessage> getResults() {
		return results;
	}

	public ReportMetaDataMessage getMetadata() {
		return metadata;
	}
}
