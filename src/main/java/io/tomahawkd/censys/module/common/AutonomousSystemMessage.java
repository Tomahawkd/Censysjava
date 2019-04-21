package io.tomahawkd.censys.module.common;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class AutonomousSystemMessage extends AbstractMessage {

	private long asn;
	private String countryCode;
	private String description;
	private String name;
	private String organization;
	private List<Integer> path;
	private String rir;
	@SerializedName("routed_prefix")
	private String routedPrefix;

	public long getAsn() {
		return asn;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getOrganization() {
		return organization;
	}

	public List<Integer> getPath() {
		return path;
	}

	public String getRir() {
		return rir;
	}

	public String getRoutedPrefix() {
		return routedPrefix;
	}

	@Override
	public String toString() {
		return "AutonomousSystemMessage{" +
				"asn=" + asn +
				", countryCode='" + countryCode + '\'' +
				", description='" + description + '\'' +
				", name='" + name + '\'' +
				", organization='" + organization + '\'' +
				", path=" + path +
				", rir='" + rir + '\'' +
				", routedPrefix='" + routedPrefix + '\'' +
				'}';
	}
}
