package shangke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shangke02 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.baidu.com");
		driver.manage().window().maximize();
		
	}
}
