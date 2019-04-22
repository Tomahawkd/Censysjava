package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class KeyExchangeSignatureMessage extends AbstractMessage {

	private String raw;
	@SerializedName("signature_and_hash_type")
	private SignatureContentMessage signature;
	@SerializedName("tls_version")
	private TLSVersionMessage tlsVersion;
	private String type;
	private boolean valid;

	public String getRaw() {
		return raw;
	}

	public SignatureContentMessage getSignature() {
		return signature;
	}

	public TLSVersionMessage getTlsVersion() {
		return tlsVersion;
	}

	public String getType() {
		return type;
	}

	public boolean isValid() {
		return valid;
	}
}
