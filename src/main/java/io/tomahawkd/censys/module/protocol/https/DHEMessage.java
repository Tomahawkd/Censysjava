package io.tomahawkd.censys.module.protocol.https;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.protocol.BasicProtocolMessage;
import io.tomahawkd.censys.module.protocol.tls.keyexchange.DHParamsMessage;

public class DHEMessage extends BasicProtocolMessage {

	@SerializedName("db_params")
	private DHParamsMessage dhParams;

	public DHParamsMessage getDhParams() {
		return dhParams;
	}
}
