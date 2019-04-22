package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class SignatureContentMessage extends AbstractMessage {

	@SerializedName("hash_algorithm")
	private String hashAlgorithm;
	@SerializedName("signature_algorithm")
	private String signatureAlgorithm;

	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}
}
