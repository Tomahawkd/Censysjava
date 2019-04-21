package io.tomahawkd.censys.module.certificates.parsed;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class CertificateIdentityMessage extends AbstractMessage {

	@SerializedName("common_name")
	private List<String> commonName;
	private List<String> country;
	@SerializedName("domain_component")
	private List<String> domainComponent;
	@SerializedName("email_address")
	private List<String> email;
	@SerializedName("given_name")
	private List<String> givenName;
	@SerializedName("jurisdiction_country")
	private List<String> jurisdictionCountry;
	@SerializedName("jurisdiction_locality")
	private List<String> jurisdictionLocality;
	@SerializedName("jurisdiction_province")
	private List<String> jurisdictionProvince;
	private List<String> locality;
	private List<String> organization;
	@SerializedName("organizational_unit")
	private List<String> organizationalUnit;
	@SerializedName("postal_code")
	private List<String> postalCode;
	private List<String> province;
	@SerializedName("serial_number")
	private List<String> serialNumber;
	@SerializedName("street_address")
	private List<String> streetAddress;
	private List<String> surname;

	public List<String> getCommonName() {
		return commonName;
	}

	public List<String> getCountry() {
		return country;
	}

	public List<String> getDomainComponent() {
		return domainComponent;
	}

	public List<String> getEmail() {
		return email;
	}

	public List<String> getGivenName() {
		return givenName;
	}

	public List<String> getJurisdictionCountry() {
		return jurisdictionCountry;
	}

	public List<String> getJurisdictionLocality() {
		return jurisdictionLocality;
	}

	public List<String> getJurisdictionProvince() {
		return jurisdictionProvince;
	}

	public List<String> getLocality() {
		return locality;
	}

	public List<String> getOrganization() {
		return organization;
	}

	public List<String> getOrganizationalUnit() {
		return organizationalUnit;
	}

	public List<String> getPostalCode() {
		return postalCode;
	}

	public List<String> getProvince() {
		return province;
	}

	public List<String> getSerialNumber() {
		return serialNumber;
	}

	public List<String> getStreetAddress() {
		return streetAddress;
	}

	public List<String> getSurname() {
		return surname;
	}
}
