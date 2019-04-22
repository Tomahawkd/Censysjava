package io.tomahawkd.censys.module.certificates.validation;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class ValidationMessage extends AbstractMessage {

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
