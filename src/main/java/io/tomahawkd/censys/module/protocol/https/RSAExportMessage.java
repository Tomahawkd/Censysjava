package io.tomahawkd.censys.module.protocol.https;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.cipher.RSAParamMessage;
import io.tomahawkd.censys.module.protocol.BasicProtocolMessage;

public class RSAExportMessage extends BasicProtocolMessage {

	@SerializedName("rsa_params")
	private RSAParamMessage rsaParam;

	public RSAParamMessage getRsaParam() {
		return rsaParam;
	}
}
