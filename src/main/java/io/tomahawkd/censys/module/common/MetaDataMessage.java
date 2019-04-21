package io.tomahawkd.censys.module.common;

import com.google.gson.annotations.SerializedName;
import io.tomahawkd.censys.module.AbstractMessage;

public class MetaDataMessage extends AbstractMessage {

	private String description;
	@SerializedName("device_type")
	private String deviceType;
	private String manufacturer;
	private String os;
	@SerializedName("os_description")
	private String osDescription;
	@SerializedName("os_version")
	private String osVersion;
	private String product;
	private String revision;
	private String version;

	public String getDescription() {
		return description;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getOs() {
		return os;
	}

	public String getOsDescription() {
		return osDescription;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public String getProduct() {
		return product;
	}

	public String getRevision() {
		return revision;
	}

	public String getVersion() {
		return version;
	}
}
