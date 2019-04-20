package io.tomahawkd.censys.module.certificates;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ParsedCertMessage extends AbstractMessage {

	private Content parsed;

	public String getFingerprint() {
		return parsed.fingerprint;
	}

	public String getSubjectDN() {
		return parsed.subjectDN;
	}

	public String getIssuerDN() {
		return parsed.issuerDN;
	}

	@Override
	public String toString() {
		return parsed.toString();
	}

	private class Content {

		@SerializedName("fingerprint_sha256")
		private String fingerprint;
		@SerializedName("subject_dn")
		private String subjectDN;
		@SerializedName("issuer_dn")
		private String issuerDN;

		@Override
		public String toString() {
			return "ParsedCertMessage{" +
					"fingerprint='" + fingerprint + '\'' +
					", subjectDN='" + subjectDN + '\'' +
					", issuerDN='" + issuerDN + '\'' +
					'}';
		}
	}
}
