package shangke;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class android_dome2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver driver;
		DesiredCapabilities des = new DesiredCapabilities();
		
		des.setCapability("platformName", "Android");     //所用的平台
		des.setCapability("platformVersion", "4.4.4");	  //所用的版本
		des.setCapability("udid", "50844e35"); // udid 连接的物理设备的唯一设备标识
		des.setCapability("deviceName", "50844e35");  //手机名字

		des.setCapability("appPackage", "com.netease.newsreader.activity");
		des.setCapability("appActivity", "com.netease.nr.phone.main.MainActivity");
		des.setCapability("unicodeKeyboard", "True");
		des.setCapability("resetKeyboard", "True");
		des.setCapability("newCommandTimeout", "20");
		des.setCapability("nosign", "True");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(30000);
		List<WebElement> els = driver.findElements(By.id("com.netease.newsreader.activity:id/ry"));
		els.get(3).click();
		driver.findElement(By.name("立即登录")).click();
		driver.findElement(By.name("注册网易邮箱")).click();
		
		Set<String> contextNames = driver.getContextHandles();
		for(String context:contextNames){
			if(context.toLowerCase().contains("webview"))
				driver.context(context);
		}
//		driver.context("WEBVIEW_com.netease.newsreader.activity");		
		driver.findElement(By.cssSelector("a.u-tips.u-tips-mobile")).click();
		driver.findElement(By.cssSelector("input#mobile")).sendKeys("13666667777");
		driver.context("NATIVE_APP");
		driver.findElementByAccessibilityId("转到上一层级").click();
	}
}
	
