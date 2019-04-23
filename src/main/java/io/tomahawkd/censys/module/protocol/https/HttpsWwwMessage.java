package io.tomahawkd.censys.module.protocol.https;

import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.protocol.http.GetInfoMessage;
import io.tomahawkd.censys.module.protocol.tls.TLSMessage;

public class HttpsWwwMessage extends AbstractMessage {

	private GetInfoMessage get;
	private TLSMessage tls;

	public GetInfoMessage getGet() {
		return get;
	}

	public TLSMessage getTls() {
		return tls;
	}
}
