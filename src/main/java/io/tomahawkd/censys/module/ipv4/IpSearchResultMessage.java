package io.tomahawkd.censys.module.ipv4;

import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.LocationMessage;

import java.util.List;

public class IpSearchResultMessage extends AbstractMessage {

	private String ip;
	private LocationMessage location;
	private List<ProtocolMessage> protocols;

	public String getIp() {
		return ip;
	}

	public LocationMessage getLocation() {
		return location;
	}

	public List<ProtocolMessage> getProtocols() {
		return protocols;
	}
}
