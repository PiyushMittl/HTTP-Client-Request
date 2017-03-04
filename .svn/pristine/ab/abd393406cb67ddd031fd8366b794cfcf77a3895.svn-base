package com.piyush.client.httpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class HttpCilentPOST {

	private String cookies;
	private HttpClient client = HttpClientBuilder.create().build();
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {
		String url = "http://192.168.110.61/index.php";

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
		//add parameter
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("username", "admin"));
		urlParameters.add(new BasicNameValuePair("password", "AtinAgarwal123"));
		urlParameters.add(new BasicNameValuePair("_submit_check", "1"));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse response = client.execute(post);
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		System.out.println(result);
	}
}