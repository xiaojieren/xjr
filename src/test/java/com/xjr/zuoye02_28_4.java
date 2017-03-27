package com.xjr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye02_28_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//a[@href='http://www.baidu.com/gaoji/preferences.html']"));
		action.moveToElement(we).perform();
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("se-settting-1")).findElement(By.id("s1_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
