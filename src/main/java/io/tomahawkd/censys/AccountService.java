package io.tomahawkd.censys;

import io.tomahawkd.censys.module.account.AccountMessage;
import io.tomahawkd.censys.net.Response;

class AccountService extends AbstractService {

	private static final String CENSYS_INDEX_ACCOUNT = "account";

	private String token;

	private AccountService(String token) {
		super(token);
	}

	static AccountService acquireToken(String uid, String secret) {
		return new AccountService(uid + ":" + secret);
	}

	AccountMessage status() {
		Response<AccountMessage> r =  Response.executeWithStatusCheckForClass(AccountMessage.class,
				"GET", constructURL(CENSYS_INDEX_ACCOUNT, ""), token, null, null);

		if (r.isError()) {
			System.out.println(r.getErrorMessage());
			throw new IllegalStateException(r.getContentMessage());
		} else {
			return r.getExpectMessage();
		}
	}
}
