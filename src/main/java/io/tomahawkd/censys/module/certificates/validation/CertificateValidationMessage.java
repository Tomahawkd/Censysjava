package io.tomahawkd.censys.module.certificates.validation;

import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateValidationMessage extends AbstractMessage {

	private ValidationMessage android;
	private ValidationMessage apple;
	private ValidationMessage java;
	private ValidationMessage microsoft;
	private ValidationMessage nss;

	public ValidationMessage getAndroid() {
		return android;
	}

	public ValidationMessage getApple() {
		return apple;
	}

	public ValidationMessage getJava() {
		return java;
	}

	public ValidationMessage getMicrosoft() {
		return microsoft;
	}

	public ValidationMessage getNss() {
		return nss;
	}
}
