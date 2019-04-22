package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.cipher.RSAParamMessage;

public class ServerKeyExchangeMessage extends AbstractMessage {

	@SerializedName("db_params")
	private DHParamsMessage dhParams;
	private String digest;
	@SerializedName("ecdh_params")
	private ECDHParamsMessage ecdhParams;
	@SerializedName("rsa_params")
	private RSAParamMessage rsaParams;
	private KeyExchangeSignatureMessage signature;
	@SerializedName("signature_error")
	private String signatureError;

	public DHParamsMessage getDhParams() {
		return dhParams;
	}

	public String getDigest() {
		return digest;
	}

	public ECDHParamsMessage getEcdhParams() {
		return ecdhParams;
	}

	public RSAParamMessage getRsaParams() {
		return rsaParams;
	}

	public String getSignatureError() {
		return signatureError;
	}
}
