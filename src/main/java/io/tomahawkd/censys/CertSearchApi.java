package io.tomahawkd.censys;

import io.tomahawkd.censys.module.certificates.CertificateMessage;
import io.tomahawkd.censys.module.searching.SearchQueryMessage;
import io.tomahawkd.censys.module.searching.CertSearchMessage;

import java.io.IOException;
import java.util.List;

public class CertSearchApi extends AbstractSearchApi {

	private static final String CENSYS_INDEX_CERT = "certificates";

	public CertSearchApi(String uid, String secret) {
		super(uid, secret);
	}

	@Override
	Response<CertSearchMessage> search(String query, int page, List<String> fields) {
		String url = constructURL("search", CENSYS_INDEX_CERT);
		try {
			return postForClass(CertSearchMessage.class,
					url, accountService.getToken(), new SearchQueryMessage(query, page, fields).buildJson());
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	Response<CertificateMessage> view(String hash) {
		String url = constructURL("view", CENSYS_INDEX_CERT) + "/" + hash;
		try {
			return getForClass(CertificateMessage.class, url, accountService.getToken());
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	Response report(String query, String field, int buckets) {
		return null;
	}

}
