package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.CertificateMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.SignedCertificateTimestampExtensionMessage;
import io.tomahawkd.censys.module.common.MetaDataMessage;
import io.tomahawkd.censys.module.protocol.tls.keyexchange.ServerKeyExchangeMessage;

import java.util.Date;
import java.util.List;

public class TLSMessage extends AbstractMessage {

	private CertificateMessage certificate;
	private List<CertificateMessage> chain;
	@SerializedName("cipher_suite")
	private CipherSuiteMessage cipherSuite;
	private MetaDataMessage metadata;
	@SerializedName("ocsp_stapling")
	private boolean ocspStapling;
	private SignedCertificateTimestampExtensionMessage scts;
	@SerializedName("secure_renegotiation")
	private boolean secureRenegotiation;
	@SerializedName("server_key_exchange")
	private ServerKeyExchangeMessage serverKeyExchange;
	@SerializedName("session_ticket")
	private SessionTicketMessage sessionTicket;
	private TLSSignatureMessage signature;
	private Date timestamp;
	private TLSValidationMessage validation;
	private String version;


}
