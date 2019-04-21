package io.tomahawkd.censys.module.certificates.parsed.extension;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;
import io.tomahawkd.censys.module.common.IdValueMessage;
import io.tomahawkd.censys.module.certificates.parsed.CertificateIdentityMessage;

import java.util.List;

public class IdentityAltNameExtensionMessage extends AbstractMessage {

	@SerializedName("directory_names")
	private List<CertificateIdentityMessage> directoryNames;
	@SerializedName("dns_names")
	private List<String> dnsNames;
	@SerializedName("edi_party_names")
	private List<EDIParty> ediPartyNames;
	@SerializedName("email_addresses")
	private List<String> emailAddress;
	@SerializedName("ip_addresses")
	private List<String> ipAddress;
	@SerializedName("other_names")
	private List<IdValueMessage> otherNames;
	@SerializedName("registered_ids")
	private List<String> registeredIds;
	@SerializedName("uniform_resource_identifiers")
	private List<String> uniformResourceIdentifiers;

	public List<CertificateIdentityMessage> getDirectoryNames() {
		return directoryNames;
	}

	public List<String> getDnsNames() {
		return dnsNames;
	}

	public List<EDIParty> getEdiPartyNames() {
		return ediPartyNames;
	}

	public List<String> getEmailAddress() {
		return emailAddress;
	}

	public List<String> getIpAddress() {
		return ipAddress;
	}

	public List<IdValueMessage> getOtherNames() {
		return otherNames;
	}

	public List<String> getRegisteredIds() {
		return registeredIds;
	}

	public List<String> getUniformResourceIdentifiers() {
		return uniformResourceIdentifiers;
	}

	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}

	public class EDIParty {

		@SerializedName("name_assigner")
		private String nameAssigner;
		@SerializedName("party_name")
		private String partyName;

		public String getNameAssigner() {
			return nameAssigner;
		}

		public String getPartyName() {
			return partyName;
		}

		@Override
		public String toString() {
			return new GsonBuilder().create().toJson(this);
		}
	}
}
