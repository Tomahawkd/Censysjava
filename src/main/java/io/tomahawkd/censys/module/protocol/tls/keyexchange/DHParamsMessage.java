package io.tomahawkd.censys.module.protocol.tls.keyexchange;

import com.google.gson.annotations.SerializedName;

public class DHParamsMessage extends DHFragmentMessage {

	private KeyParamFragmentMessage generator;
	private KeyParamFragmentMessage prime;
	@SerializedName("session_key")
	private KeyParamFragmentMessage sessionKey;

	public KeyParamFragmentMessage getGenerator() {
		return generator;
	}

	public KeyParamFragmentMessage getPrime() {
		return prime;
	}

	public KeyParamFragmentMessage getSessionKey() {
		return sessionKey;
	}
}
