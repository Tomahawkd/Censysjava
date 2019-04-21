package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class TLSSignatureMessage extends AbstractMessage {

	@SerializedName("hash_algorithm")
	private String hashAlgorithm;
	@SerializedName("signature_algorithm")
	private String signatureAlgorithm;
	@SerializedName("signature_error")
	private String signatureError;
	private boolean valid;

	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public String getSignatureError() {
		return signatureError;
	}

	public boolean isValid() {
		return valid;
	}
}
