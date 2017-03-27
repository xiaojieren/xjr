package xuexi02;

import org.openqa.selenium.WebDriver;

public class loginpage_lauage extends basepage{

	public loginpage_lauage(WebDriver driver) {
		super(driver);
		driver.get("http://127.0.0.1/zentao/user-login-L3plbnRhby8=.html");
	}
	
	public void clockloginlauage(){
		click("div#langs button.btn");
	}
	
	public void clockloginlauage_sure(){
		click("div#langs>ul li:nth-child(3)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void typeusername(String name){
		type("input#account",name);
	}
	
	public void typepassword(String passwd){
		type("input[name='password']",passwd);
	}
	
	public void clocklogin(){
		click("button#submit");
	}
	
}
