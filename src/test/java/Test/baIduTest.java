package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baIduTest {
	WebDriver driver;
	
	@DataProvider(name="test")
		public Object[][] getdata(){
		Object a[][] = {{"seleium","seleium_百度一下"},{"testNG","testNG_百度一下"}};
		return a;
	}
		
		
	@Parameters({"URL","PORT"})
		@BeforeMethod
		public void url(String url,String port) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		driver.manage().window().maximize();
	  		driver.get( url+":"+ port);
//	  		driver.get("https://www.baidu.com");
  		}
	
	
	  @Test
	  	public void title_test01() {
		  	String con = driver.getTitle();
		  	Assert.assertEquals(con, "百度一下，你就知道");
	  }
	  
	  
	@Test(dataProvider="test")
		public void baidu(String a,String b) throws InterruptedException{
			driver.findElement(By.cssSelector("#id")).sendKeys(a);
			driver.findElement(By.cssSelector("#su")).click();
			Thread.sleep(3000);
			String title = driver.getTitle();
			Assert.assertEquals(title, b);
	}
	
	
	  @AfterMethod
	  public void tearDown() throws InterruptedException{
		  Thread.sleep(3000);
		  driver.quit();
	  }
}
