package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.account.AccountMessage;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AccountService extends AbstractService {

	private static final String CENSYS_INDEX_ACCOUNT = "account";

	private String token;

	private AccountService() {
		this(null);
	}

	private AccountService(String token) {
		super();
		this.token = token;
	}

	public static AccountService acquireToken(String uid, String secret) {
		String token = uid + ":" + secret;
		String tokenEncoded = Base64.getEncoder().encodeToString(token.getBytes(StandardCharsets.UTF_8));
		return new AccountService(tokenEncoded);
	}

	public AccountMessage status() throws CensysException {
		try {
			Response<AccountMessage> r = getForClass(AccountMessage.class,
					constructURL(CENSYS_INDEX_ACCOUNT, ""), token);

			return wrapMessage(r);
		} catch (IOException e) {
			throw new CensysException(e.getCause());
		}
	}

	@Nullable
	String getToken() {
		return token;
	}
}
