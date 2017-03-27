package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_27_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.0.1/phpwind/");
		
//		driver.findElement(By.cssSelector("html body div.wrap div.main_wrap div.main div.main_sidebar div form dl dt input#J_password")).sendKeys("123");
//		driver.findElement(By.cssSelector("input#J_password")).sendKeys("123");
//		driver.findElement(By.cssSelector("input[id='J_password']")).sendKeys("123");
//		driver.findElement(By.cssSelector("dt#J_sidebar_login_dt input#J_password")).sendKeys("123");
		driver.findElement(By.cssSelector("input[id$='password']")).sendKeys("123");
	}
}
