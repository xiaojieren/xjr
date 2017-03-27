package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye03_01_1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.0.1/phpwind/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("J_username")).sendKeys("admin");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("J_head_user_a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='http://172.16.0.1/phpwind/index.php?m=profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("profile_avatar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.other_upload a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.mb10 input")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:/test/a.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("J_avatgar_normal_btn")).click();
	}
}
