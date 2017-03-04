package com.piyush.client.rivu;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class MyJSONResponseHandler implements ResponseHandler<JSONObject> {
	public JSONObject handleResponse(final HttpResponse response) throws IOException {
		int status = response.getStatusLine().getStatusCode();
		JSONObject returnData = new JSONObject();
		JSONParser parser = new JSONParser();
		if (status >= 200 && status < 300) {
			HttpEntity entity = response.getEntity();
			try {

				if (null == entity) {
					returnData.put("status_code", "1");
					returnData.put("error_message", "null Data Found");
				} else {
					returnData = (JSONObject) parser.parse(EntityUtils.toString(entity));
				}
			} catch (org.json.simple.parser.ParseException e) {
				returnData.put("status_code", "1");
				returnData.put("error_message", e.getMessage());
			}
		} else {
			returnData.put("status_code", "1");
			returnData.put("error_message", "Unexpected response status: " + status);
		}

		return returnData;
	}
}
