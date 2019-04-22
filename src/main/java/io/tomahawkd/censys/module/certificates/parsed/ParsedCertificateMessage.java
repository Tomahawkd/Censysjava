package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.CertificateExtensionMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.CertificateUnknownExtensionsMessage;

import java.util.List;

public class ParsedCertificateMessage extends AbstractMessage {

	private CertificateExtensionMessage extensions;
	@SerializedName("fingerprint_md5")
	private String fingerprintMD5;
	@SerializedName("fingerprint_sha1")
	private String fingerprintSHA1;
	@SerializedName("fingerprint_sha256")
	private String fingerprintSHA256;
	private CertificateIssuerMessage issuer;
	@SerializedName("issuer_dn")
	private String issuerDN;
	private List<String> names;
	private boolean redacted;
	@SerializedName("serial_number")
	private String serialNumber;
	private CertificateSignatureMessage signature;
	@SerializedName("signature_algorithm")
	private CertificateAlgorithmMessage signatureAlgorithm;
	@SerializedName("spki_subject_fingerprint")
	private String fingerprintSPKISubject;
	private CertificateSubjectMessage subject;
	@SerializedName("subject_dn")
	private String subjectDN;
	@SerializedName("subject_key_info")
	private CertificateSubjectKeyInfoMessage subjectKeyInfo;
	@SerializedName("tbs_fingerprint")
	private String fingerprintTBS;
	@SerializedName("tbs_noct_fingerprint")
	private String fingerprintTBSNoCT;
	@SerializedName("unknown_extensions")
	private CertificateUnknownExtensionsMessage unknownExtensions;
	@SerializedName("validation_level")
	private String validationLevel;
	private CertificateValidityMessage validity;
	private short version;

	public CertificateExtensionMessage getExtensions() {
		return extensions;
	}

	public String getFingerprintMD5() {
		return fingerprintMD5;
	}

	public String getFingerprintSHA1() {
		return fingerprintSHA1;
	}

	public String getFingerprintSHA256() {
		return fingerprintSHA256;
	}

	public CertificateIssuerMessage getIssuer() {
		return issuer;
	}

	public String getIssuerDN() {
		return issuerDN;
	}

	public List<String> getNames() {
		return names;
	}

	public boolean isRedacted() {
		return redacted;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public CertificateSignatureMessage getSignature() {
		return signature;
	}

	public CertificateAlgorithmMessage getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public String getFingerprintSPKISubject() {
		return fingerprintSPKISubject;
	}

	public CertificateSubjectMessage getSubject() {
		return subject;
	}

	public String getSubjectDN() {
		return subjectDN;
	}

	public CertificateSubjectKeyInfoMessage getSubjectKeyInfo() {
		return subjectKeyInfo;
	}

	public String getFingerprintTBS() {
		return fingerprintTBS;
	}

	public String getFingerprintTBSNoCT() {
		return fingerprintTBSNoCT;
	}

	public CertificateUnknownExtensionsMessage getUnknownExtensions() {
		return unknownExtensions;
	}

	public String getValidationLevel() {
		return validationLevel;
	}

	public CertificateValidityMessage getValidity() {
		return validity;
	}

	public short getVersion() {
		return version;
	}
}