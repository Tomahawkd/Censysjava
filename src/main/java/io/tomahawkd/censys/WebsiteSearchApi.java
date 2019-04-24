package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.module.reporting.ReportMessage;
import io.tomahawkd.censys.module.searching.SearchQueryMessage;
import io.tomahawkd.censys.module.searching.WebsiteSearchMessage;

import java.io.IOException;
import java.util.List;

public class WebsiteSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_WEBSITE = "websites";

	public WebsiteSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	public WebsiteSearchApi(AccountService accountService) {
		super(accountService);
	}

	@Override
	public WebsiteSearchMessage search(String query, int page, List<String> fields) throws CensysException {
		String url = constructURL("search", CENSYS_INDEX_WEBSITE);
		try {
			Response<WebsiteSearchMessage> response = postForClass(WebsiteSearchMessage.class,
					url, accountService.getToken(), new SearchQueryMessage(query, page, fields).buildJson());

			return wrapMessage(response);
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public Message view(String id) throws CensysException {
		return null;
	}

	@Override
	public ReportMessage report(String query, String field, int buckets) throws CensysException {
		String url = constructURL("report", CENSYS_INDEX_WEBSITE);
		return report(url, query, field, buckets);
	}
}
