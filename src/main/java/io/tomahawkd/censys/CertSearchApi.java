package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.certificates.CertificateMessage;
import io.tomahawkd.censys.module.reporting.ReportMessage;
import io.tomahawkd.censys.module.reporting.ReportQueryMessage;
import io.tomahawkd.censys.module.searching.CertSearchMessage;
import io.tomahawkd.censys.module.searching.SearchQueryMessage;

import java.io.IOException;
import java.util.List;

public class CertSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_CERT = "certificates";

	public CertSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	public CertSearchApi(AccountService accountService) {
		super(accountService);
	}

	@Override
	public CertSearchMessage search(String query, int page, List<String> fields) throws CensysException {
		String url = constructURL("search", CENSYS_INDEX_CERT);
		try {
			Response<CertSearchMessage> response = postForClass(CertSearchMessage.class,
					url, accountService.getToken(), new SearchQueryMessage(query, page, fields).buildJson());

			return wrapMessage(response);
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public CertificateMessage view(String hash) throws CensysException {
		String url = constructURL("view", CENSYS_INDEX_CERT) + "/" + hash;
		try {
			Response<CertificateMessage> response =
					getForClass(CertificateMessage.class, url, accountService.getToken());

			return wrapMessage(response);
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public ReportMessage report(String query, String field, int buckets) throws CensysException {
		String url = constructURL("report", CENSYS_INDEX_CERT);
		return report(url, query, field, buckets);
	}

}
