package com.xjr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye02_28_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
		
		driver.findElement(By.id("kw")).sendKeys(Keys.TAB);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform(); 
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform(); 
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform(); 
		
	}
}
