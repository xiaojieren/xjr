package weixin;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class zuoye03_10_xinjianfenzu {
public static void fenzu(String s) throws ClientProtocolException, IOException{
		
		CloseableHttpClient hc = HttpClients.createDefault();
		HttpPost hg = new HttpPost("https://api.weixin.qq.com/cgi-bin/groups/create?access_token="+s);
		String data = "{\"group\":{\"name\":\"test\"}}";
		StringEntity stringentity = new StringEntity(data,ContentType.create("text/json", "UTF-8"));
		hg.setEntity(stringentity);
		CloseableHttpResponse hr= hc.execute(hg);
		HttpEntity entity = hr.getEntity();
		
		String content = EntityUtils.toString(entity,"utf-8"); 
		System.out.println(content);
	}

}
