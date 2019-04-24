package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.module.reporting.ReportMessage;
import io.tomahawkd.censys.module.searching.IpSearchMessage;
import io.tomahawkd.censys.module.searching.SearchQueryMessage;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;

public class IpSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_IP = "ipv4";

	public IpSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	public IpSearchApi(AccountService accountService) {
		super(accountService);
	}

	@Override
	public IpSearchMessage search(String query, int page, List<String> fields) throws CensysException {
		String url = constructURL("search", CENSYS_INDEX_IP);
		try {
			Response<IpSearchMessage> response = postForClass(IpSearchMessage.class,
					url, accountService.getToken(), new SearchQueryMessage(query, page, fields).buildJson());

			return wrapMessage(response);
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	@Nullable
	public Message view(String id) throws CensysException {
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
	public ReportMessage report(String query, String field, int buckets) throws CensysException {
		String url = constructURL("report", CENSYS_INDEX_IP);
		return report(url, query, field, buckets);
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

