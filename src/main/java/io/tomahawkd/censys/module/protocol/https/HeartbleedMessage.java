package io.tomahawkd.censys.module.protocol.https;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.BasicInfoMessage;

public class HeartbleedMessage extends BasicInfoMessage {

	@SerializedName("heartbeat_enabled")
	private boolean heartbeatEnabled;
	@SerializedName("heartbleed_vulnerable")
	private boolean vulnerable;

	public boolean isHeartbeatEnabled() {
		return heartbeatEnabled;
	}

	public boolean isVulnerable() {
		return vulnerable;
	}
}
