package com.xjr;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_24 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.0.1/phpwind/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("J_username")).sendKeys("xjr");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.className("header_post")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("J_cate_item")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("J_forum_item")).click();
		driver.findElement(By.id("J_head_forum_sub")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("J_atc_title")).sendKeys("我的第一个帖子");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.className("wind_editor_iframe"));
		driver.switchTo().frame(frame).findElement(By.className("editor_content")).sendKeys("第一个脚本");;
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("J_post_sub")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("icon_quit")).click();
	}
}