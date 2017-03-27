package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_27_4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.0.1/phpwind/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("J_username")).sendKeys("admin");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("J_check")).click();
		driver.findElement(By.xpath("//a[@href='http://172.16.0.1/phpwind/index.php?c=manage&a=delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div[2]/div[2]/dl/dd/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div[3]/button")).click();
	}
}
