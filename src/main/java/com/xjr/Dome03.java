package com.xjr;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Dome03 {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient hc = HttpClients.createDefault();
		HttpGet hg = new HttpGet("http://www.qq.com/");
		RequestConfig config = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000)
				.setConnectionRequestTimeout(2000).build();
		hg.setConfig(config);
		
		CloseableHttpResponse hr = hc.execute(hg);
		HttpEntity he = hr.getEntity();
		String content = EntityUtils.toString(he, "UTF-8");
		System.out.println(content);
		hc.close();
		
	}
}
