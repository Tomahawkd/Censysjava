package io.tomahawkd.censys;

import io.tomahawkd.censys.module.account.AccountMessage;
import io.tomahawkd.censys.net.Response;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class AccountService extends AbstractService {

	private static final String CENSYS_INDEX_ACCOUNT = "account";

	private AccountService(String token) {
		super(token);
	}

	static AccountService acquireToken(String uid, String secret) {
		String token = uid + ":" + secret;
		String tokenEncoded = Base64.getEncoder().encodeToString(token.getBytes(StandardCharsets.UTF_8));
		return new AccountService(tokenEncoded);
	}

	AccountMessage status() {
		Response<AccountMessage> r =  Response.executeWithStatusCheckForClass(AccountMessage.class,
				"GET", constructURL(CENSYS_INDEX_ACCOUNT, ""), getToken(), null, null);

		if (r.isError()) {
			System.out.println(r.getErrorMessage());
			throw new IllegalStateException(r.getContentMessage());
		} else {
			return r.getExpectMessage();
		}
	}
}
