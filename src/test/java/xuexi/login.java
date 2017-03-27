package xuexi;

import org.openqa.selenium.WebDriver;

public class login {
	
	private static WebDriver driver;
	
	public static void setdriver(WebDriver drivers){
		driver = drivers;	
	}
	
	public static WebDriver getdriver(){
		return driver;
	}
	public static void login(String username,String password){
		loginpage lg = new loginpage(driver);
//		lg.clockloginlauage();
//		lg.clockloginlauage_sure();
		lg.typeusername(username);
		lg.typepassword(password);
		lg.clocklogin();
	}
	
}
