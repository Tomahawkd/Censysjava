package io.tomahawkd.censys.module.account;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.DateConverter;

import java.util.Date;

public class AccountMessage extends AbstractMessage {

	public static AccountMessage parse(String data) {
		return new GsonBuilder()
				.registerTypeAdapter(DateConverter.targetClass, new DateConverter()).create()
				.fromJson(data, AccountMessage.class);
	}

	@SerializedName("login")
	private String loginName;
	private String email;
	@SerializedName("first_login")
	private Date firstLogin;
	@SerializedName("last_login")
	private Date lastLogin;
	private Quota quota;

	private class Quota {
		private int used;
		@SerializedName("resets_at")
		private Date resetTime;
		private int allowance;

		@Override
		public String toString() {
			return "Quota{" +
					"used=" + used +
					", resetTime=" + resetTime +
					", allowance=" + allowance +
					'}';
		}
	}

	public String getLoginName() {
		return loginName;
	}

	public String getEmail() {
		return email;
	}

	public Date getFirstLogin() {
		return firstLogin;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public int getUsedQuotaCount() {
		return quota.used;
	}

	public Date getQuotaResetTime() {
		return quota.resetTime;
	}

	public int getQuotaAllowance() {
		return quota.allowance;
	}

	@Override
	public String toString() {
		return "AccountMessage{" +
				"loginName='" + loginName + '\'' +
				", email='" + email + '\'' +
				", firstLogin=" + firstLogin +
				", lastLogin=" + lastLogin +
				", quota=" + quota +
				'}';
	}
}
