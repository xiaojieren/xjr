package shangke;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class android {
	public static void main(String[] args) throws Exception {
		AndroidDriver driver = null;
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability("platformName", "Android");     //所用的平台
		des.setCapability("platformVersion", "4.4");	  //所用的版本
		des.setCapability("udid", "192.168.17.101:5555"); // udid 连接的物理设备的唯一设备标识
		des.setCapability("deviceName", "Custom Phone");  //手机名字
		
		des.setCapability("appPackage", "com.sky.jisuanji"); 				//对应app的包名
		des.setCapability("appActivity", ".JisuanjizixieActivity");     	//对应的APP的入口Active的名字
		
//		des.setCapability("unicodeKeyboard", "True");//支持中文输入
//		des.setCapability("resetKeyboard", "True");//支持中文输入
//		des.setCapability("newCommandTimeout", "10");//没有新命令时的超时时间设置
//		des.setCapability("nosign", "True");//跳过检查和对应用进行 debug 签名的步骤
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("com.sky.jisuanji:id/btn1")).click();
		driver.findElement(By.id("com.sky.jisuanji:id/jia")).click();
		driver.findElement(By.id("com.sky.jisuanji:id/btn3")).click();
		driver.findElement(By.id("com.sky.jisuanji:id/denyu")).click();
		
		
	}

	
}
