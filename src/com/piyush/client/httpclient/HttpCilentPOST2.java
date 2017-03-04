package com.piyush.client.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpCilentPOST2 {

	private String cookies;
	private HttpClient client = HttpClientBuilder.create().build();
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		DefaultHttpClient httpclient = new DefaultHttpClient();
		String url = "http://192.168.110.61/index.php";
		HttpPost httpPost = new HttpPost(url);

		httpPost.addHeader("username", "admin");
		httpPost.addHeader("password", "AtinAgarwal123");
		httpPost.addHeader("_submit_check", "1");

		HttpResponse response = httpclient.execute(httpPost);
		System.out.println("");

	}
}