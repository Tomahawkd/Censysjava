package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateSignatureMessage extends AbstractMessage {

	@SerializedName("self_signed")
	private boolean selfSigned;
	@SerializedName("valid")
	private boolean valid;
	@SerializedName("signature_algorithm")
	private CertificateAlgorithmMessage signatureAlgorithm;
	private String value;

	public boolean isSelfSigned() {
		return selfSigned;
	}

	public boolean isValid() {
		return valid;
	}

	public CertificateAlgorithmMessage getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "CertificateSignatureMessage{" +
				"selfSigned=" + selfSigned +
				", valid=" + valid +
				", signatureAlgorithm=" + signatureAlgorithm +
				", value='" + value + '\'' +
				'}';
	}
}
