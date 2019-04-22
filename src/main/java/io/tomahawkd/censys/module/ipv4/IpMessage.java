package io.tomahawkd.censys.module.ipv4;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.GenericModuleMessage;

public class IpMessage extends GenericModuleMessage {

	@SerializedName("autonomous_system")
	private AutonomousSystemMessage autonomousSystem;
	private String ip;
	private long ipInt;
	private LocationMessage location;

	public String getIp() {
		return ip;
	}

	public LocationMessage getLocation() {
		return location;
	}

	public AutonomousSystemMessage getAutonomousSystem() {
		return autonomousSystem;
	}

	public long getIpInt() {
		return ipInt;
	}
}
