package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.certificates.parsed.CertificateIdentityMessage;
import io.tomahawkd.censys.module.ipv4.IpAddressMessage;

import java.util.List;

public class NameConstraintsExtensionMessage extends AbstractMessage {

	private boolean critical;
	@SerializedName("excluded_directory_names")
	private List<CertificateIdentityMessage> excludedDirectoryNames;
	@SerializedName("excluded_edi_party_names")
	private List<IdentityAlternativeNameExtensionMessage.EDIParty> excludedEdiPartyNames;
	@SerializedName("excluded_email_addresses")
	private List<String> excludedEmailAddress;
	@SerializedName("excluded_ip_addresses")
	private List<IpAddressMessage> excludedIpAddress;
	@SerializedName("excluded_names")
	private List<String> excludedNames;
	@SerializedName("excluded_registered_ids")
	private List<String> excludedRegisteredIds;

	@SerializedName("permitted_directory_names")
	private List<CertificateIdentityMessage> permittedDirectoryNames;
	@SerializedName("permitted_edi_party_names")
	private List<IdentityAlternativeNameExtensionMessage.EDIParty> permittedEdiPartyNames;
	@SerializedName("permitted_email_addresses")
	private List<String> permittedEmailAddress;
	@SerializedName("permitted_ip_addresses")
	private List<IpAddressMessage> permittedIpAddress;
	@SerializedName("permitted_names")
	private List<String> permittedNames;
	@SerializedName("permitted_registered_ids")
	private List<String> permittedRegisteredIds;

	public boolean isCritical() {
		return critical;
	}

	public List<CertificateIdentityMessage> getExcludedDirectoryNames() {
		return excludedDirectoryNames;
	}

	public List<IdentityAlternativeNameExtensionMessage.EDIParty> getExcludedEdiPartyNames() {
		return excludedEdiPartyNames;
	}

	public List<String> getExcludedEmailAddress() {
		return excludedEmailAddress;
	}

	public List<IpAddressMessage> getExcludedIpAddress() {
		return excludedIpAddress;
	}

	public List<String> getExcludedNames() {
		return excludedNames;
	}

	public List<String> getExcludedRegisteredIds() {
		return excludedRegisteredIds;
	}

	public List<CertificateIdentityMessage> getPermittedDirectoryNames() {
		return permittedDirectoryNames;
	}

	public List<IdentityAlternativeNameExtensionMessage.EDIParty> getPermittedEdiPartyNames() {
		return permittedEdiPartyNames;
	}

	public List<String> getPermittedEmailAddress() {
		return permittedEmailAddress;
	}

	public List<IpAddressMessage> getPermittedIpAddress() {
		return permittedIpAddress;
	}

	public List<String> getPermittedNames() {
		return permittedNames;
	}

	public List<String> getPermittedRegisteredIds() {
		return permittedRegisteredIds;
	}

}
