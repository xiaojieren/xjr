package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_27_3 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	for (int i=0;i<=10;i++)
	{
	driver.get("http://172.16.0.1/phpwind/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[class^='btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("J_reg_username")).sendKeys("test1"+i);
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.name("repassword")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(i+"45@qq.com");
	driver.findElement(By.cssSelector("button[class^='btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("J_head_user_a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='http://172.16.0.1/phpwind/index.php?m=u&c=login&a=logout']")).click();
	}
	
 }
 
}
