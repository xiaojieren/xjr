package shangke;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

//2017年3月6日下午6:36:58
public class android_dome4 {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		/*
		 * 
		 * 
		 * 
		*/
		AndroidDriver driver;
		DesiredCapabilities des = new DesiredCapabilities();
		
		des.setCapability("platformName", "Android");     //所用的平台
		des.setCapability("platformVersion", "4.4.4");	  //所用的版本
		des.setCapability("udid", "50844e35"); 			  // udid 连接的物理设备的唯一设备标识
		des.setCapability("deviceName", "50844e35");      //手机名字

		des.setCapability("appPackage", "com.sky.jisuanji");
		des.setCapability("appActivity", ".JisuanjizixieActivity");
		des.setCapability("unicodeKeyboard", "True");
		des.setCapability("resetKeyboard", "True");
		des.setCapability("newCommandTimeout", "20");
		des.setCapability("nosign", "True");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		TouchAction tas = new TouchAction(driver);
		tas.press(280, 1160).waitAction(1000)
		  .moveTo(0, 440).waitAction(1000)
		  .moveTo(440, 0).waitAction(1000)
		  .moveTo(0, 400).waitAction(1000)
		  .moveTo(420, 0).waitAction(1000)
		  .moveTo(0, 440).release()
		  .perform();
	}
}
