package xuexi02;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dome {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		workflow.setdriver(driver);
		workflow.openbug();
	}
}
