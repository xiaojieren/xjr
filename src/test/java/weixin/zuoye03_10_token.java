package weixin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.JsonObject;

public class zuoye03_10_token {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient hc = HttpClients.createDefault();
		
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("grant_type", "client_credential")); 
		nvps.add(new BasicNameValuePair("appid", "wxfa406ed62eb31abf")); 
		nvps.add(new BasicNameValuePair("secret", "15670909ffc875654b5635548bddeee1")); 
		
		String str = EntityUtils.toString(new UrlEncodedFormEntity(nvps,Consts.UTF_8));		
		HttpGet hg = new HttpGet("https://api.weixin.qq.com/cgi-bin/token?"+str);
		
		CloseableHttpResponse hr = hc.execute(hg);
		HttpEntity entity = hr.getEntity();
		String content = EntityUtils.toString(entity,"utf-8"); 

		JSONObject jo = new JSONObject(content);
		String s = jo.getString("access_token");
		System.out.println(s);
		
		List i = zuoye03_10_openid.getyonghu1(s);
		zuoye03_10_qunfa.setqunfa(s);
		zuoye03_10_openidqunfa.fenzu(s);
		zuoye03_10_xinjianfenzu.fenzu(s);
	}
}
