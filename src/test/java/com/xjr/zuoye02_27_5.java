package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_27_5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.0.1/phpwind/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("J_username")).sendKeys("admin");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='http://172.16.0.1/phpwind/read.php?tid=1&fid=2']")).click();
    	driver.findElement(By.cssSelector("//table/tbody/tr/td.subject/p/a +a +a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@class='btn_replay' and @href='http://172.16.0.1/phpwind/index.php?c=post&a=reply&tid=1' ]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("J_atc_title")).sendKeys("我的第一个帖子");
//		WebElement frame = driver.findElement(By.className("wind_editor_iframe"));
//		driver.switchTo().frame(frame).findElement(By.className("editor_content")).sendKeys("第一个脚本");;
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		driver.findElement(By.id("J_post_sub")).click();

	}
}
