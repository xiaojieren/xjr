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

public class zuoye03_10_qunfa {
	public static void setqunfa(String s) throws ClientProtocolException, IOException {

		CloseableHttpClient hc = HttpClients.createDefault();
		HttpPost hg = new HttpPost("https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token="+s);
		String data =  "{\"touser\":[\"ox1df1J27fxCVH_E9yw-4HPrc3b4\",\"ox1df1OmAL09Oe0e8x8zCS9l7IYU\"],\"msgtype\":\"text\",\"text\":{\"content\":\"hello from boxer.\"}";
		StringEntity stringentity = new StringEntity(data,ContentType.create("text/json", "UTF-8"));
		hg.setEntity(stringentity);
		CloseableHttpResponse hr= hc.execute(hg);
		HttpEntity entity = hr.getEntity();

		String content = EntityUtils.toString(entity,"utf-8"); 
		System.out.println(content);
	}
}
