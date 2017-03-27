package com.xjr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zuoye02_27_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.0.1/phpwind/");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/div/form/dl/dt/input[1]")).sendKeys("jhl");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/div/form/dl/dt/input[1]")).clear();
		
		driver.findElement(By.xpath("//form/dl/dt/input[1]")).sendKeys("zxc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/dl/dt/input[1]")).clear();
		
		driver.findElement(By.xpath("//input[@class='input' and @id='J_username' ]")).sendKeys("qwe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='input' and @id='J_username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='J_username']")).sendKeys("asd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='J_username']")).clear();

		driver.findElement(By.xpath("//input[starts-with(@id,'J_username')]")).sendKeys("xjr");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@id,'J_username')]")).clear();

		
		
	}
}
