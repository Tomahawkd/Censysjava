package io.tomahawkd.censys;

import io.tomahawkd.censys.net.Response;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IpSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_IP = "ipv4";

	IpSearchApi(AccountService accountService) {
		super(accountService);
	}

	@Override
	Response search(String query, int page, List<String> fields, boolean flatten) {
		String url = constructURL("search", CENSYS_INDEX_IP);
		return null;
	}

	@Override
	@Nullable Response view(String id) {
		checkId(id);

		String url = constructURL("view", CENSYS_INDEX_IP) + "/" + id;

		Response response;
//		try {
//			response = get(url, null);
//		} catch (IOException e) {
//			throw new IllegalArgumentException();
//		}
		return null;
	}

	@Override
	Response report(String query, String field, int buckets) {
		return null;
	}

	private void checkId(String id) {
		try {
			String[] digits = id.split(".");
			for (int i = 0; i < 4; i++) {
				int digit = Integer.parseInt(digits[i]);
				if (digit > 255 || digit < 0) throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Not valid IP address");
		}
	}
}

