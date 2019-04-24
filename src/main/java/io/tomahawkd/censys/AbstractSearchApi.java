package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.module.account.AccountMessage;
import io.tomahawkd.censys.module.reporting.ReportMessage;
import io.tomahawkd.censys.module.reporting.ReportQueryMessage;

import java.io.IOException;
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

	public Message search(String query, int page, List<String> fields) throws CensysException {
		throw new UnsupportedOperationException("Not implement yet");
	}

	public Message view(String id) throws CensysException {
		throw new UnsupportedOperationException("Not implement yet");
	}

	public Message report(String query, String field, int buckets) throws CensysException {
		throw new UnsupportedOperationException("Not implement yet");
	}

	protected ReportMessage report(String url, String query, String field, int buckets) throws CensysException {
		try {
			Response<ReportMessage> response = postForClass(ReportMessage.class,
					url, accountService.getToken(), new ReportQueryMessage(query, field, buckets).buildJson());

			return wrapMessage(response);
		} catch (IOException e) {
			throw new CensysException(e.getCause());
		}
	}

	// since i am not subscribing an enterprise account, have to leave it unimplemented _(:з」∠)_
	public Message data() throws CensysException {
		throw new UnsupportedOperationException("Not implement yet");
	}

	public AccountMessage status() {
		return accountService.status();
	}

}
