package xuexi02;

import org.openqa.selenium.WebDriver;

public class mainpage extends basepage{
	
	public mainpage (WebDriver driver){
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	
	public void clickmyplace(){
		click("ul.nav li. active");
	}
	
	public void clickproduct(){
		click("ul.nav li a#menuproduct");
	}
	
	public void clickproject(){
		click("ul.nav li a#menuproject");
	}
	
	public void clicktest(){
		click("ul.nav li a#menuqa");
	}
}
