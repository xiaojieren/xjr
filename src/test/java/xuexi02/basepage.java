package xuexi02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basepage {
	WebDriver driver;
	
	public basepage(WebDriver driver){
		this.driver=driver;
	}
	public void type(String a,String b){
		WebElement e1 = driver.findElement(By.cssSelector(a));
		e1.sendKeys(b);
	}
	
	public void click(String a){
		WebElement e2 = driver.findElement(By.cssSelector(a));
		e2.click();
	}
	
	public String title(){
		wait(3000);
		return driver.getTitle();
	}
	
	public void wait(int a){
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
