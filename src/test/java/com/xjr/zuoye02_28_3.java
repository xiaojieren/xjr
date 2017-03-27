package com.xjr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class zuoye02_28_3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.cssSelector("div#lg img"));
		Actions action = new Actions(driver);
		action.contextClick(we).perform();
		Thread.sleep(5000);
		
		
		Runtime.getRuntime().exec("D:/test/a2.exe");
	}

}
