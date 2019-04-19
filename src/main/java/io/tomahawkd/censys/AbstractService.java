package io.tomahawkd.censys;

import io.tomahawkd.censys.module.Message;
import io.tomahawkd.censys.net.Response;

import java.io.IOException;
import java.util.Map;

abstract class AbstractService {

	private static final String api_url = "https://censys.io/api/v1";

	protected String constructURL(String endpoint, String index) {
		if (endpoint.isEmpty() && index.isEmpty()) return api_url;
		else if (index.isEmpty()) return api_url + "/" + endpoint;
		return api_url + "/" + endpoint + "/" + index;
	}

	protected final Response getForClass(Class<? extends Message> clazz,
	                                     String url,
	                                     Map<String, String> param) throws IOException {
		return Response.executeWithAuthForClass(clazz, "GET", url, token, param, "");
	}

	protected final Response postForClass(Class<? extends Message> clazz,
	                                      String url,
	                                      Map<String, String> param,
	                                      String content) throws IOException {
		return Response.executeWithAuthForClass(clazz, "POST", url, token, param, content);
	}
}
