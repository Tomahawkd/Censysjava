package io.tomahawkd.censys.module.ipv4;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.common.GenericModuleMessage;
import io.tomahawkd.censys.module.port.*;

public class IpMessage extends GenericModuleMessage {

	@SerializedName("25")
	private Port25Message port25;
	@SerializedName("80")
	private Port80Message port80;
	@SerializedName("443")
	private Port443Message port443;
	@SerializedName("465")
	private Port465Message port465;
	@SerializedName("8080")
	private Port8080Message port8080;
	@SerializedName("8888")
	private Port8888Message port8888;
	@SerializedName("16992")
	private Port16992Message port16992;
	@SerializedName("16993")
	private Port16993Message port16993;

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

	public Port25Message getPort25() {
		return port25;
	}

	public Port80Message getPort80() {
		return port80;
	}

	public Port443Message getPort443() {
		return port443;
	}

	public Port465Message getPort465() {
		return port465;
	}

	public Port8080Message getPort8080() {
		return port8080;
	}

	public Port8888Message getPort8888() {
		return port8888;
	}

	public Port16992Message getPort16992() {
		return port16992;
	}

	public Port16993Message getPort16993() {
		return port16993;
	}
}
