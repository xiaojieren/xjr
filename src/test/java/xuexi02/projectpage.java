package xuexi02;

import org.openqa.selenium.WebDriver;

public class projectpage extends basepage{

	public projectpage(WebDriver driver) {
		super(driver);
	}
	
	public void clickbug(){
		click("ul.nav li a#submenubug");
	}
	
	public void clicksubmitbug(){
		click("div.actions a +a");
	}
	
	public String gettitle(){
		return title();
	}
	
	
}
