package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class AuthorityInfoAccessExtensionMessage extends AbstractMessage {

	@SerializedName("issuer_urls")
	private List<String> issuerUrls;
	@SerializedName("ocsp_urls")
	private List<String> ocspUrls;

	public List<String> getIssuerUrls() {
		return issuerUrls;
	}

	public List<String> getOcspUrls() {
		return ocspUrls;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
}
