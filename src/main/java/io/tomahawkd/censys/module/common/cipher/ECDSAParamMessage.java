package io.tomahawkd.censys.module.common.cipher;

import io.tomahawkd.censys.module.AbstractMessage;

public class ECDSAParamMessage extends AbstractMessage {

	private String b;
	private String curve;
	private String n;
	private String p;
	private String gx;
	private String gy;
	private String x;
	private String y;
	private int length;
	private String pub;

	public String getCurve() {
		return curve;
	}

	public String getGx() {
		return gx;
	}

	public String getGy() {
		return gy;
	}

	public int getLength() {
		return length;
	}

	public String getPub() {
		return pub;
	}

	public String getB() {
		return b;
	}

	public String getN() {
		return n;
	}

	public String getP() {
		return p;
	}

	public String getX() {
		return x;
	}

	public String getY() {
		return y;
	}
}
