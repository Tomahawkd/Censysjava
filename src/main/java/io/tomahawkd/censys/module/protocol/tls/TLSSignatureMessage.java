package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.tls.keyexchange.SignatureContentMessage;

public class TLSSignatureMessage extends SignatureContentMessage {

	@SerializedName("signature_error")
	private String signatureError;
	private boolean valid;

	public String getSignatureError() {
		return signatureError;
	}

	public boolean isValid() {
		return valid;
	}
}
