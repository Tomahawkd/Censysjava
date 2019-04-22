package io.tomahawkd.censys.module.common;

import com.google.gson.annotations.JsonAdapter;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.util.DateConverter;

import java.util.Date;

public class BasicInfoMessage extends AbstractMessage {

	private MetaDataMessage metadata;
	@JsonAdapter(DateConverter.class)
	private Date timestamp;

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	public Date getTimestamp() {
		return timestamp;
	}
}
