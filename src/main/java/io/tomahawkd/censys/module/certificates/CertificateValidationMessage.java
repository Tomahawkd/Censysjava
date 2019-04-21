package io.tomahawkd.censys.module.certificates;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateValidationMessage extends AbstractMessage {

	private Validation android;
	private Validation apple;
	private Validation java;
	private Validation microsoft;
	private Validation nss;

	public Validation getAndroid() {
		return android;
	}

	public Validation getApple() {
		return apple;
	}

	public Validation getJava() {
		return java;
	}

	public Validation getMicrosoft() {
		return microsoft;
	}

	public Validation getNss() {
		return nss;
	}

	public class Validation extends AbstractMessage {

		@SerializedName("trusted_path")
		private boolean trustedPath;
		private String type;
		private boolean valid;
		@SerializedName("was_valid")
		private boolean wasValid;

		public boolean isTrustedPath() {
			return trustedPath;
		}

		public String getType() {
			return type;
		}

		public boolean isValid() {
			return valid;
		}

		public boolean isWasValid() {
			return wasValid;
		}
	}
}
