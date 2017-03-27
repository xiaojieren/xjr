package weixin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class zuoye03_10_media {
	public static void main(String a[]) throws ClientProtocolException, IOException {



		CloseableHttpClient hc = HttpClients.createDefault();
		HttpPost hg = new HttpPost("https://api.weixin.qq.com/cgi-bin/media/upload?access_token="
				+ "S5Tb4aF5vSxbJsV9KN-tNgYOEUA_qb1t7G2RF5gfDscXq4P7rWexjLswiP4GheCxeXpsqkbugTOi0O1x05GinXgN-A1zsqqJbRJ5A7N2U3fCfRl-ChIw9YISe-F2TH0EVTOjAJAHFA"
				+"&type=image");
		StringEntity stringentity = new StringEntity("E:\\images\\axjr\\23.jpg");
		hg.setEntity(stringentity);
		
		CloseableHttpResponse hr= hc.execute(hg);
		HttpEntity entity = hr.getEntity();
		
		String content = EntityUtils.toString(entity,"utf-8"); 
		System.out.println(content);
	}
}
