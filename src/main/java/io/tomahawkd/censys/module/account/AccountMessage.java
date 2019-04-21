package io.tomahawkd.censys.module.account;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.Date;

public class AccountMessage extends AbstractMessage {

	@SerializedName("login")
	private String loginName;
	private String email;
	@SerializedName("first_login")
	private Date firstLogin;
	@SerializedName("last_login")
	private Date lastLogin;
	private Quota quota;

	private class Quota extends AbstractMessage {
		private int used;
		@SerializedName("resets_at")
		private Date resetTime;
		private int allowance;
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
}
