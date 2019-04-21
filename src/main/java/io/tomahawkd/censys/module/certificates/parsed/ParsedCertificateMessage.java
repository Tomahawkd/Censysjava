package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.CertificateExtensionMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.CertificateUnknownExtensionsMessage;

import java.util.List;

public class ParsedCertificateMessage extends AbstractMessage {

	public static GsonBuilder registerConverter(GsonBuilder builder) {
		builder = CertificateValidityMessage.registerConverter(builder);
		builder = CertificateExtensionMessage.registerConverter(builder);
		return CertificateSubjectKeyInfoMessage.registerConverter(builder);
	}

	private CertificateExtensionMessage extension;
	@SerializedName("fingerprint_md5")
	private String fingerprintMD5;
	@SerializedName("fingerprint_sha1")
	private String fingerprintSHA1;
	@SerializedName("fingerprint_sha256")
	private String fingerprintSHA256;
	private CertificateIdentityMessage issuer;
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
	private CertificateIdentityMessage subject;
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

	public CertificateExtensionMessage getExtension() {
		return extension;
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

	public CertificateIdentityMessage getIssuer() {
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

	public CertificateIdentityMessage getSubject() {
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

	@Override
	public String toString() {
		return "ParsedCertificateMessage{" +
				"extension=" + extension +
				", fingerprintMD5='" + fingerprintMD5 + '\'' +
				", fingerprintSHA1='" + fingerprintSHA1 + '\'' +
				", fingerprintSHA256='" + fingerprintSHA256 + '\'' +
				", issuer=" + issuer +
				", issuerDN='" + issuerDN + '\'' +
				", names=" + names +
				", redacted=" + redacted +
				", serialNumber='" + serialNumber + '\'' +
				", signature=" + signature +
				", signatureAlgorithm=" + signatureAlgorithm +
				", fingerprintSPKISubject='" + fingerprintSPKISubject + '\'' +
				", subject=" + subject +
				", subjectDN='" + subjectDN + '\'' +
				", subjectKeyInfo=" + subjectKeyInfo +
				", fingerprintTBS='" + fingerprintTBS + '\'' +
				", fingerprintTBSNoCT='" + fingerprintTBSNoCT + '\'' +
				", unknownExtensions=" + unknownExtensions +
				", validationLevel='" + validationLevel + '\'' +
				", validity=" + validity +
				", version=" + version +
				'}';
	}
}