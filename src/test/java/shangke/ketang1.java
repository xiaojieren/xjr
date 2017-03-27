package shangke;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ketang1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.baidu.com");
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions action = new Actions(driver); 
//		WebElement a = driver.findElement(By.cssSelector("a[name='tj_briicon']"));
//		action.moveToElement(a).perform(); //将鼠标移到元素上
//		WebElement b = driver.findElement(By.cssSelector("span.bdbriimgitem_4"));
//		action.click(b).release().perform();  //鼠标按下和按上
		
//		WebElement b = driver.findElement(By.cssSelector("a[name='tj_trnuomi']"));
//		Actions action = new Actions(driver);
//		action.contextClick(b).perform(); //鼠标右击
		
		driver.findElement(By.cssSelector("input#kw")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.ENTER).perform();
			action.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform();
		
		
		

	}
}
