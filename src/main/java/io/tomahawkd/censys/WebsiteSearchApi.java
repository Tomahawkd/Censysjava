package io.tomahawkd.censys;

import java.util.List;

public class WebsiteSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_WEBSITE = "websites";

	public WebsiteSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	@Override
	Response search(String query, int page, List<String> fields) {
		return null;
	}

	@Override
	Response view(String id) {
		return null;
	}

	@Override
	Response report(String query, String field, int buckets) {
		return null;
	}
}
