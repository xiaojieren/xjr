package Reader;

import org.json.JSONArray;
import org.json.JSONObject;


public class ReadJson {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject("{'name':'abc','age':3}");
		String name = jo.getString("name");
		int age = jo.getInt("age");
		System.out.println(name+":"+age);
		
		JSONArray ja = new
				JSONArray("[{'name':'apc','age':20},{'name':'top','age':15}]");
				System.out.print(ja.getJSONObject(1).getString("name")+":");
				System.out.print(ja.getJSONObject(0).getInt("age"));
	}
}
