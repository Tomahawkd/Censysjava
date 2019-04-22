package io.tomahawkd.censys.module.common;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.ipv4.PortInfoMessage;
import io.tomahawkd.censys.module.util.DateConverter;

import java.util.Date;
import java.util.List;

public class GenericModuleMessage extends ModuleMessage {

	private String notes;
	private List<Integer> ports;
	private List<PortInfoMessage> protocols;
	private MetaDataMessage metadata;
	@JsonAdapter(DateConverter.class)
	@SerializedName("updated_at")
	private Date updateAt;
	@SerializedName("zdb_version")
	private long zdbVersion;

	public String getNotes() {
		return notes;
	}

	public List<Integer> getPorts() {
		return ports;
	}

	public List<PortInfoMessage> getProtocols() {
		return protocols;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public long getZdbVersion() {
		return zdbVersion;
	}
}
