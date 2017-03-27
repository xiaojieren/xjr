package xuexi;

import org.openqa.selenium.WebDriver;

public class mainpage extends basepage{
	
	public mainpage (WebDriver driver){
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	
}
