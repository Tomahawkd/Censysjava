package io.tomahawkd.censys.module.ipv4;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResultMessage {

	static GsonBuilder registerConverter(GsonBuilder builder) {
		return ProtocolMessage.registerConverter(builder);
	}

	private String ip;
	private Location location;
	private List<ProtocolMessage> protocols;

	public String getIp() {
		return ip;
	}

	public List<ProtocolMessage> getProtocols() {
		return protocols;
	}

	public String getProvince() {
		return location.province;
	}

	public String getCountry() {
		return location.country;
	}

	public double getLongitude() {
		return location.longitude;
	}

	public String getRegisteredCountry() {
		return location.registeredCountry;
	}

	public String getRegisteredCountryCode() {
		return location.registeredCountryCode;
	}

	public String getCountryCode() {
		return location.countryCode;
	}

	public double getLatitude() {
		return location.latitude;
	}

	public String getTimezone() {
		return location.timezone;
	}

	public String getContinent() {
		return location.continent;
	}

	private class Location {
		private String province;
		private String country;
		private double longitude;
		@SerializedName("registered_country")
		private String registeredCountry;
		@SerializedName("registered_country_code")
		private String registeredCountryCode;
		@SerializedName("country_code")
		private String countryCode;
		private double latitude;
		private String timezone;
		private String continent;
	}
}
