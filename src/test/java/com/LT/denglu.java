package com.LT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class denglu {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.0.1/phpwind");
		Thread.sleep(3000);
		driver.findElement(By.id("J_username")).sendKeys("xjr");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("J_head_user_a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://172.16.0.1/phpwind/index.php?m=u&c=login&a=logout']")).click();
		
	}
}
