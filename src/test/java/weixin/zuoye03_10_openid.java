package weixin;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class zuoye03_10_openid {
	public static List  getyonghu1(String s) throws ClientProtocolException, IOException {
		
		CloseableHttpClient hc = HttpClients.createDefault();
		HttpGet hg = new HttpGet("https://api.weixin.qq.com/cgi-bin/user/get?access_token="+s);
		CloseableHttpResponse hr= hc.execute(hg);
		HttpEntity entity = hr.getEntity();
		String content = EntityUtils.toString(entity,"utf-8"); 
		
		JSONObject jo = new JSONObject(content);
		
		List list = new ArrayList();
		for(int i = 0;i<2;i++){
			String str = jo.getJSONObject("data").getJSONArray("openid").getString(i);
			list.add(str);
		}
		System.out.println(list);
		return list;
	}
}
