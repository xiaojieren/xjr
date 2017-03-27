package shangke;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class android_dome3 {
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			AndroidDriver driver;
			DesiredCapabilities des = new DesiredCapabilities();
			des.setCapability("platformName", "Android");
			des.setCapability("platformVersion", "4.4.4");
			des.setCapability("udid", "50844e35");
			des.setCapability("deviceName", "50844e35");
			
			des.setCapability("unicodeKeyboard", "True");
			des.setCapability("resetKeyboard", "True");
			des.setCapability("newCommandTimeout", "10");
			des.setCapability("nosign", "True");
			
			
			des.setCapability("appPackage", "com.android.calculator2");
			des.setCapability("appActivity", ".Calculator");
//			des.setCapability("browserName", "chrome");
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//			driver.get("https://www.baidu.com");
//			Thread.sleep(10000);
//			driver.findElement(By.id("index-kw")).sendKeys("admin");
//			driver.findElement(By.cssSelector("button#index-bn")).click();
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
			driver.rotate(ScreenOrientation.LANDSCAPE);
			
		}
}
