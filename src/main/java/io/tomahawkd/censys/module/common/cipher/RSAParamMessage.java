package io.tomahawkd.censys.module.common.cipher;

public class RSAParamMessage {

	private long exponent;
	private int length;
	private String modulus;

	public long getExponent() {
		return exponent;
	}

	public int getLength() {
		return length;
	}

	public String getModulus() {
		return modulus;
	}
}
