package io.tomahawkd.censys.module.certificates;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.certificates.ct.CtsMessage;
import io.tomahawkd.censys.module.certificates.parsed.ParsedCertificateMessage;
import io.tomahawkd.censys.module.certificates.validation.CertificateValidationMessage;
import io.tomahawkd.censys.module.certificates.zlint.CertificateZlintMessage;
import io.tomahawkd.censys.module.common.ModuleMessage;

import java.util.List;

public class CertificateMessage extends ModuleMessage {

	private CtsMessage ct;
	@SerializedName("fingerprint_sha256")
	private String fingerprintSHA256;
	private CertificateMetadataMessage metadata;
	@SerializedName("parent_spki_subject_fingerprint")
	private String parentSpkiSubjectFingerprint;
	private List<String> parents;
	private ParsedCertificateMessage parsed;
	private boolean precert;
	private String raw;
	private CertificateValidationMessage validation;
	private CertificateZlintMessage zlint;

	public CtsMessage getCt() {
		return ct;
	}

	public String getFingerprintSHA256() {
		return fingerprintSHA256;
	}

	public String getParentSpkiSubjectFingerprint() {
		return parentSpkiSubjectFingerprint;
	}

	public List<String> getParents() {
		return parents;
	}

	public ParsedCertificateMessage getParsed() {
		return parsed;
	}

	public boolean isPrecert() {
		return precert;
	}

	public String getRaw() {
		return raw;
	}

	public CertificateValidationMessage getValidation() {
		return validation;
	}

	public CertificateZlintMessage getZlint() {
		return zlint;
	}
}
