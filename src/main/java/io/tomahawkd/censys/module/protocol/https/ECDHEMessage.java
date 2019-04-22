package io.tomahawkd.censys.module.protocol.https;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.BasicProtocolMessage;
import io.tomahawkd.censys.module.protocol.tls.keyexchange.ECDHParamsMessage;

public class ECDHEMessage extends BasicProtocolMessage {

	@SerializedName("ecdh_params")
	private ECDHParamsMessage ecdhParams;

	public ECDHParamsMessage getEcdhParams() {
		return ecdhParams;
	}
}
