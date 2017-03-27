package com.xjr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class a {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd--HH:mm:ss");//设置日期格式
		String time = df.format(new Date());   
		System.out.println(time);
	}

}
