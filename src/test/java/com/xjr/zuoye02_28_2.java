package com.xjr;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye02_28_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("http://172.16.0.1/phpwind/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class^=btn]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("J_reg_username")).sendKeys("qwe11");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.id("J_reg_username"));
		action.moveToElement(we).perform();
		action.doubleClick().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("repassword")).sendKeys("123456");
        
		driver.findElement(By.xpath("//input[@name='email']")).click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.UP).perform();
		driver.findElement(By.xpath("//input[@name='email']")).click();
		action.sendKeys(Keys.ENTER).perform();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("@qq.com");
		Thread.sleep(2000);
		
//		driver.findElement(By.id("J_match_2")).findElement(By.xpath("//a[@href='#']")).click();
		
		List<WebElement> el = driver.findElements(By.cssSelector("div.mail_down  ul  ~ li a "));
		for(WebElement e:el){
			System.out.println(e.getText());
		}
	}
}
