package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class CertificatePoliciesExtensionMessage extends AbstractMessage {

	private List<String> cps;
	private String id;
	@SerializedName("user_notice")
	private List<UserNotice> userNotices;

	public List<String> getCps() {
		return cps;
	}

	public String getId() {
		return id;
	}

	public List<UserNotice> getUserNotices() {
		return userNotices;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}

	public class UserNotice {

		@SerializedName("explicit_text")
		private String explicitText;

		public String getExplicitText() {
			return explicitText;
		}

		@Override
		public String toString() {
			return "UserNotice{" +
					"explicitText='" + explicitText + '\'' +
					'}';
		}
	}
}
