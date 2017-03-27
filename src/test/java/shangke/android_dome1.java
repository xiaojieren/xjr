package shangke;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

/*2017年3月6日上午9:05:37*/
public class android_dome1 {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = null;
		DesiredCapabilities des = new DesiredCapabilities();
		
		des.setCapability("platformName", "Android");     //所用的平台
		des.setCapability("platformVersion", "4.2.2");	  //所用的版本
		des.setCapability("udid", "192.168.17.101:5555"); // udid 连接的物理设备的唯一设备标识
		des.setCapability("deviceName", "S3");  //手机名字

		des.setCapability("unicodeKeyboard", "True");//支持中文输入
		des.setCapability("resetKeyboard", "True");//支持中文输入
		des.setCapability("newCommandTimeout", "10");//没有新命令时的超时时间设置
		des.setCapability("nosign", "True");//跳过检查和对应用进行 debug 签名的步骤
		
		des.setCapability("appPackage", "com.sky.jisuanji"); 				//对应app的包名
		des.setCapability("appActivity", ".JisuanjizixieActivity");     	//对应的APP的入口Active的名字
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
		driver.findElementByXPath("//android.widget.Button[@text='+']").click();
		driver.findElementByXPath("//android.widget.Button[@text='7']").click();
		driver.findElementByXPath("//android.widget.Button[@text='=']").click();
	}

}
