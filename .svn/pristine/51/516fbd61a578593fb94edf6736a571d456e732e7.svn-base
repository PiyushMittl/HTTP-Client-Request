package com.piyush.client.rivu;

import java.io.IOException;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;

public class ResponseHandlerJSONExmpl {

	public static void main(String[] args) {
		// Creates a reference to CloseableHttpClient, which is thread safe
		CloseableHttpClient httpclient = HttpClients.createDefault();
		ResponseHandler<JSONObject> responseHandler = (ResponseHandler<JSONObject>) new MyJSONResponseHandler();

		try {
			HttpGet httpget = new HttpGet("http://192.168.110.61/index.php");

			JSONObject responseBody = (JSONObject) httpclient.execute(httpget, responseHandler);
			String statusCode = (String) responseBody.get("status_code");
			if (statusCode.equalsIgnoreCase("0")) {
				JSONObject data = (JSONObject) responseBody.get("data");
				System.out.println(data);
			} else {
				System.out.println(responseBody);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}