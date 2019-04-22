package io.tomahawkd.censys;

import java.util.List;

abstract class AbstractSearchApi extends AbstractService {

	protected final AccountService accountService;

	AbstractSearchApi(String uid, String secret) {
		this(AccountService.acquireToken(uid, secret));
	}

	AbstractSearchApi(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	public Response search(String query, int page, List<String> fields) {
		throw new UnsupportedOperationException("Not implement yet");
	}

	public Response view(String id) {
		throw new UnsupportedOperationException("Not implement yet");
	}

	public Response report(String query, String field, int buckets) {
		throw new UnsupportedOperationException("Not implement yet");
	}

	// since i am not subscribing an enterprise account, have to leave it unimplemented _(:з」∠)_
	public Response data() {
		throw new UnsupportedOperationException("Not implement yet");
	}

}
