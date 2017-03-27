package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.baidu.com");
		String title = driver.getTitle();
		if(title.equals("百度一下,你就知道"))
			System.out.println("测试通过");
		else
			System.out.println("测试失败");
		Thread.sleep(5000);
		driver.findElement(By.id("kw")).sendKeys("皮皮虾，我们走");
		driver.findElement(By.id("su")).click();;
		Thread.sleep(5000);
		

		driver.close(); 
		
	}
}