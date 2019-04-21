package io.tomahawkd.censys.module.common;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class LocationMessage extends AbstractMessage {

	private String city;
	private String continent;
	private String country;
	@SerializedName("country_code")
	private String countryCode;
	private double latitude;
	private double longitude;
	@SerializedName("postal_code")
	private String postalCode;
	private String province;
	@SerializedName("registered_country")
	private String registeredCountry;
	@SerializedName("registered_country_code")
	private String registeredCountryCode;
	private String timezone;

	public String getCity() {
		return city;
	}

	public String getContinent() {
		return continent;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getProvince() {
		return province;
	}

	public String getRegisteredCountry() {
		return registeredCountry;
	}

	public String getRegisteredCountryCode() {
		return registeredCountryCode;
	}

	public String getTimezone() {
		return timezone;
	}

	@Override
	public String toString() {
		return "LocationMessage{" +
				"city='" + city + '\'' +
				", continent='" + continent + '\'' +
				", country='" + country + '\'' +
				", countryCode='" + countryCode + '\'' +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", postalCode='" + postalCode + '\'' +
				", province='" + province + '\'' +
				", registeredCountry='" + registeredCountry + '\'' +
				", registeredCountryCode='" + registeredCountryCode + '\'' +
				", timezone='" + timezone + '\'' +
				'}';
	}
}