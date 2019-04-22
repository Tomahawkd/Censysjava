package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.cipher.ECDSAParamMessage;
import io.tomahawkd.censys.module.common.cipher.RSAParamMessage;
import io.tomahawkd.censys.module.util.TypeAdapterRegister;

import java.lang.reflect.Type;

public class CertificateSubjectKeyInfoMessage extends AbstractMessage {

	@SerializedName("dsa_public_key")
	private DSAPublicKey dsaPublicKey;
	@SerializedName("ecdsa_public_key")
	private ECDSAParamMessage ecdsaPublicKey;
	@SerializedName("fingerprint_sha256")
	private String fingerprintSHA256;
	@SerializedName("key_algorithm")
	private CertificateAlgorithmMessage keyAlgorithm;
	@SerializedName("rsa_public_key")
	private RSAParamMessage rsaPublicKey;

	// Exclude it default
	private transient KeyType type;


	public enum KeyType {
		DSA, ECDSA, RSA, UNKNOWN
	}

	private static class KeyTypeDeserializer implements JsonDeserializer<CertificateSubjectKeyInfoMessage> {

		static {
			TypeAdapterRegister.getInstance().register(CertificateSubjectKeyInfoMessage.class,
					new KeyTypeDeserializer());
		}

		@Override
		public CertificateSubjectKeyInfoMessage
		deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			CertificateSubjectKeyInfoMessage keyInfoMessage = context.deserialize(json, typeOfT);
			if (keyInfoMessage.dsaPublicKey != null) keyInfoMessage.setType(KeyType.DSA);
			else if (keyInfoMessage.ecdsaPublicKey != null) keyInfoMessage.setType(KeyType.ECDSA);
			else if (keyInfoMessage.rsaPublicKey != null) keyInfoMessage.setType(KeyType.RSA);
			else keyInfoMessage.setType(KeyType.UNKNOWN);

			return keyInfoMessage;
		}
	}

	private void setType(KeyType type) {
		this.type = type;
	}

	public KeyType getType() {
		return type;
	}

	public DSAPublicKey getDsaPublicKey() {
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

	public class DSAPublicKey extends AbstractMessage {
		@Override
		public String toString() {
			return "";
		}
	}
}
