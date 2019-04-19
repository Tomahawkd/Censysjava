package io.tomahawkd.censys;

import io.tomahawkd.censys.net.Response;

import java.util.List;

public class CertSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_CERT = "certificates";

	CertSearchApi(AccountService accountService) {
		super(accountService);
	}

	@Override
	public Response search(String query, int page, List<String> fields, boolean flatten) {
		return null;
	}

	@Override
	public Response view(String id) {
		return null;
	}

	@Override
	public Response report(String query, String field, int buckets) {
		return null;
	}

}
