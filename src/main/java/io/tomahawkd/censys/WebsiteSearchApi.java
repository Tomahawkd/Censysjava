package io.tomahawkd.censys;

import io.tomahawkd.censys.module.searching.SearchQueryMessage;
import io.tomahawkd.censys.module.searching.WebsiteSearchMessage;

import java.io.IOException;
import java.util.List;

public class WebsiteSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_WEBSITE = "websites";

	public WebsiteSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	@Override
	Response<WebsiteSearchMessage> search(String query, int page, List<String> fields) {
		String url = constructURL("search", CENSYS_INDEX_WEBSITE);
		try {
			return postForClass(WebsiteSearchMessage.class,
					url, accountService.getToken(),
					null, new SearchQueryMessage(query, page, fields).buildJson());
		} catch (IOException e) {
			return null;
		}
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
