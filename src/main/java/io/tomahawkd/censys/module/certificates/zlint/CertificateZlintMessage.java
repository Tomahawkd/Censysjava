package io.tomahawkd.censys.module.certificates.zlint;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class CertificateZlintMessage extends AbstractMessage {

	@SerializedName("errors_present")
	private boolean errorPresent;
	@SerializedName("fatals_present")
	private boolean fatalsPresent;
	private CertificateLintMessage lints;
	@SerializedName("notices_present")
	private boolean noticesPresent;
	private int version;
	@SerializedName("warnings_present")
	private boolean warningsPresent;

	public boolean isErrorPresent() {
		return errorPresent;
	}

	public boolean isFatalsPresent() {
		return fatalsPresent;
	}

	public CertificateLintMessage getLint() {
		return lints;
	}

	public boolean isNoticesPresent() {
		return noticesPresent;
	}

	public int getVersion() {
		return version;
	}

	public boolean isWarningsPresent() {
		return warningsPresent;
	}
}
