package com.xjr;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class get_dome01 {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet hg = new HttpGet("http://www.qq.com");
		CloseableHttpResponse chr = httpclient.execute(hg);
		HttpEntity he = chr.getEntity();
		String content = EntityUtils.toString(he, "UTF-8");
		System.out.println(content);
		httpclient.close();
	}
}
