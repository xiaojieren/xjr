package com.xjr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Dome02 {

	public static void main(String[] args) throws ParseException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		HttpPost hp = new HttpPost("https://192.168.0.:5000");
		
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "newdream"));
		nvps.add(new BasicNameValuePair("password", "123456"));  
		hp.setEntity(new UrlEncodedFormEntity(nvps,Consts.UTF_8)); 

		CloseableHttpResponse hr = httpclient.execute(hp);
		HttpEntity entity = hr.getEntity();
		String content = EntityUtils.toString(entity,"utf-8");
		System.out.println(content);
	}

}
