package io.tomahawkd.censys.module.common;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.Date;

public class BasicInfoMessage extends AbstractMessage {

	private MetaDataMessage metadata;
	private Date timestamp;

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	public Date getTimestamp() {
		return timestamp;
	}
}
