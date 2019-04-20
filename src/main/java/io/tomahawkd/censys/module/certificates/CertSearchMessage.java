package io.tomahawkd.censys.module.certificates;

import com.google.gson.GsonBuilder;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.MetaDataMessage;

import java.util.List;

public class CertSearchMessage extends AbstractMessage {

	public static CertSearchMessage parse(String data) {
		return new GsonBuilder().create().fromJson(data, CertSearchMessage.class);
	}

	private String status;
	private List<ParsedCertMessage> results;
	private MetaDataMessage metadata;

	public String getStatus() {
		return status;
	}

	public List<ParsedCertMessage> getParsed() {
		return results;
	}

	public MetaDataMessage getMetadata() {
		return metadata;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
