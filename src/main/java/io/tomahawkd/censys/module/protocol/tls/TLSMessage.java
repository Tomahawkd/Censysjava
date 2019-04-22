package io.tomahawkd.censys.module.protocol.tls;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.certificates.CertificateMessage;
import io.tomahawkd.censys.module.certificates.parsed.extension.SignedCertificateTimestampExtensionMessage;
import io.tomahawkd.censys.module.common.BasicInfoMessage;
import io.tomahawkd.censys.module.protocol.tls.keyexchange.ServerKeyExchangeMessage;

import java.util.List;

public class TLSMessage extends BasicInfoMessage {

	private CertificateMessage certificate;
	private List<CertificateMessage> chain;
	@SerializedName("cipher_suite")
	private CipherSuiteMessage cipherSuite;
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
	private TLSValidationMessage validation;
	private String version;

	public CertificateMessage getCertificate() {
		return certificate;
	}

	public List<CertificateMessage> getChain() {
		return chain;
	}

	public CipherSuiteMessage getCipherSuite() {
		return cipherSuite;
	}

	public boolean isOcspStapling() {
		return ocspStapling;
	}

	public SignedCertificateTimestampExtensionMessage getScts() {
		return scts;
	}

	public boolean isSecureRenegotiation() {
		return secureRenegotiation;
	}

	public ServerKeyExchangeMessage getServerKeyExchange() {
		return serverKeyExchange;
	}

	public SessionTicketMessage getSessionTicket() {
		return sessionTicket;
	}

	public TLSSignatureMessage getSignature() {
		return signature;
	}

	public TLSValidationMessage getValidation() {
		return validation;
	}

	public String getVersion() {
		return version;
	}
}
