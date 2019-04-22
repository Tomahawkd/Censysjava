package io.tomahawkd.censys.module.common;

import io.tomahawkd.censys.module.AbstractMessage;

import java.util.List;

public class ModuleMessage extends AbstractMessage {

	private List<String> tags;

	public List<String> getTags() {
		return tags;
	}
}
