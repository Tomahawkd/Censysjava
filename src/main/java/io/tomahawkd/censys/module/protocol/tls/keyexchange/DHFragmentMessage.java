package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class DHFragmentMessage extends AbstractMessage {

	@SerializedName("client_private")
	private KeyParamFragmentMessage clientPrivate;
	@SerializedName("client_public")
	private KeyParamFragmentMessage clientPublic;
	@SerializedName("server_private")
	private KeyParamFragmentMessage serverPrivate;
	@SerializedName("server_public")
	private KeyParamFragmentMessage serverPublic;

	public KeyParamFragmentMessage getClientPrivate() {
		return clientPrivate;
	}

	public KeyParamFragmentMessage getClientPublic() {
		return clientPublic;
	}

	public KeyParamFragmentMessage getServerPrivate() {
		return serverPrivate;
	}

	public KeyParamFragmentMessage getServerPublic() {
		return serverPublic;
	}
}
