package xuexi;

import org.openqa.selenium.WebDriver;

public class loginpage extends basepage{
	
	public loginpage (WebDriver driver){
		super(driver);
		driver.get("http://127.0.0.1/zentao/user-login-L3plbnRhby8=.html");
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
