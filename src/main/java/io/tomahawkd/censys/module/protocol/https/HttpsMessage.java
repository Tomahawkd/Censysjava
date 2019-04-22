package io.tomahawkd.censys.module.protocol.https;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.protocol.http.GetInfoMessage;
import io.tomahawkd.censys.module.protocol.ssl.SSLv3Message;
import io.tomahawkd.censys.module.protocol.tls.TLS11Message;
import io.tomahawkd.censys.module.protocol.tls.TLS12Message;
import io.tomahawkd.censys.module.protocol.tls.TLSMessage;

public class HttpsMessage extends AbstractMessage {

	private DHEMessage dhe;
	@SerializedName("dhe_export")
	private ExportDHEMessage exportDHE;
	private ECDHEMessage ecdhe;
	private GetInfoMessage get;
	private HeartbleedMessage heartbleed;
	@SerializedName("rsa_export")
	private RSAExportMessage rsaExport;
	@SerializedName("ssl_3")
	private SSLv3Message ssLv3;
	private TLSMessage tls;
	@SerializedName("tls_1_1")
	private TLS11Message tls11;
	@SerializedName("tls_1_2")
	private TLS12Message tls12;

	public DHEMessage getDhe() {
		return dhe;
	}

	public ExportDHEMessage getExportDHE() {
		return exportDHE;
	}

	public ECDHEMessage getEcdhe() {
		return ecdhe;
	}

	public GetInfoMessage get() {
		return get;
	}

	public HeartbleedMessage getHeartbleed() {
		return heartbleed;
	}

	public RSAExportMessage getRsaExport() {
		return rsaExport;
	}

	public SSLv3Message getSsLv3() {
		return ssLv3;
	}

	public TLSMessage getTls() {
		return tls;
	}

	public TLS11Message getTls11() {
		return tls11;
	}

	public TLS12Message getTls12() {
		return tls12;
	}
}
