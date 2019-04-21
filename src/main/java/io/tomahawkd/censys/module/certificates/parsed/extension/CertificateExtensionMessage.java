package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class CertificateExtensionMessage extends AbstractMessage {

	@SerializedName("authority_info_access")
	private AuthorityInfoAccessExtensionMessage authorityInfoAccess;
	@SerializedName("authority_key_id")
	private String authorityKeyId;
	@SerializedName("basic_constraints")
	private BasicConstraintsExtensionMessage basicConstraints;
	@SerializedName("certificate_policies")
	private List<CertificatePoliciesExtensionMessage> certificatePolicies;
	@SerializedName("crl_distribution_points")
	private List<String> crlDistributionPoints;
	@SerializedName("ct_poison")
	private boolean CTPoison;
	@SerializedName("extended_key_usage")
	private ExtendedKeyUsageExtensionMessage extendedKeyUsage;
	@SerializedName("issuer_alt_name")
	private IdentityAltNameExtensionMessage issuerAltName;
	@SerializedName("key_usage")
	private KeyUsageExtensionMessage keyUsage;
	@SerializedName("name_constraints")
	private NameConstraintsExtensionMessage nameConstraints;
	@SerializedName("signed_certificate_timestamps")
	private List<SignedCertificateTimestampExtensionMessage> signedCertificateTimestamps;
	@SerializedName("subject_alt_name")
	private IdentityAltNameExtensionMessage subjectAltName;
	@SerializedName("subject_key_id")
	private String subjectKeyId;

	public AuthorityInfoAccessExtensionMessage getAuthorityInfoAccess() {
		return authorityInfoAccess;
	}

	public String getAuthorityKeyId() {
		return authorityKeyId;
	}

	public BasicConstraintsExtensionMessage getBasicConstraints() {
		return basicConstraints;
	}

	public List<CertificatePoliciesExtensionMessage> getCertificatePolicies() {
		return certificatePolicies;
	}

	public List<String> getCrlDistributionPoints() {
		return crlDistributionPoints;
	}

	public boolean isCTPoison() {
		return CTPoison;
	}

	public ExtendedKeyUsageExtensionMessage getExtendedKeyUsage() {
		return extendedKeyUsage;
	}

	public IdentityAltNameExtensionMessage getIssuerAltName() {
		return issuerAltName;
	}

	public KeyUsageExtensionMessage getKeyUsage() {
		return keyUsage;
	}

	public NameConstraintsExtensionMessage getNameConstraints() {
		return nameConstraints;
	}

	public List<SignedCertificateTimestampExtensionMessage> getSignedCertificateTimestamps() {
		return signedCertificateTimestamps;
	}

	public IdentityAltNameExtensionMessage getSubjectAltName() {
		return subjectAltName;
	}

	public String getSubjectKeyId() {
		return subjectKeyId;
	}
}
