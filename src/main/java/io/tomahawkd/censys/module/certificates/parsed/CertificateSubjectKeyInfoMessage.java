package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.cipher.DSAParamMessage;
import io.tomahawkd.censys.module.common.cipher.ECDSAParamMessage;
import io.tomahawkd.censys.module.common.cipher.RSAParamMessage;

public class CertificateSubjectKeyInfoMessage extends AbstractMessage {

	@SerializedName("dsa_public_key")
	private DSAParamMessage dsaPublicKey;
	@SerializedName("ecdsa_public_key")
	private ECDSAParamMessage ecdsaPublicKey;
	@SerializedName("fingerprint_sha256")
	private String fingerprintSHA256;
	@SerializedName("key_algorithm")
	private CertificateAlgorithmMessage keyAlgorithm;
	@SerializedName("rsa_public_key")
	private RSAParamMessage rsaPublicKey;

	public DSAParamMessage getDsaPublicKey() {
		return dsaPublicKey;
	}

	public ECDSAParamMessage getEcdsaPublicKey() {
		return ecdsaPublicKey;
	}

	public String getFingerprintSHA256() {
		return fingerprintSHA256;
	}

	public CertificateAlgorithmMessage getKeyAlgorithm() {
		return keyAlgorithm;
	}

	public RSAParamMessage getRsaPublicKey() {
		return rsaPublicKey;
	}
}
