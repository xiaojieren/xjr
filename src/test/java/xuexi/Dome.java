package xuexi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dome {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		login.setdriver(driver);
		login.login("admin", "123456");
	}
}
