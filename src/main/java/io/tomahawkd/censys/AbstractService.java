package io.tomahawkd.censys;

import io.tomahawkd.censys.exception.CensysException;
import io.tomahawkd.censys.module.Message;

import java.io.IOException;

abstract class AbstractService {

	private static final String api_url = "https://censys.io/api/v1";

	protected String constructURL(String endpoint, String index) {
		if (endpoint.isEmpty() && index.isEmpty()) return api_url;
		else if (index.isEmpty()) return api_url + "/" + endpoint;
		return api_url + "/" + endpoint + "/" + index;
	}

	protected final <T extends Message> Response<T> getForClass(Class<T> clazz,
	                                                            String url,
	                                                            String token) throws IOException {
		return Response.executeWithAuthForClass(clazz, "GET", url, token, "");
	}

	protected final <T extends Message> Response<T> postForClass(Class<T> clazz,
	                                                             String url,
	                                                             String token,
	                                                             String content) throws IOException {
		return Response.executeWithAuthForClass(clazz, "POST", url, token, content);
	}

	protected <T extends Message> T wrapMessage(Response<T> response) throws CensysException {

		if (response.isError()) throw new CensysException(response.getErrorMessage());
		else return response.getExpectMessage();
	}
}
