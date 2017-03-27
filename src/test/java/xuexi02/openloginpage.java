package xuexi02;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

public class openloginpage {
	
	private static WebDriver driver;
	
	public static void setdriver(WebDriver drivers){
		driver = drivers;	
	}
	
	public static WebDriver getdriver(){
		return driver;
	}
	public static mainpage login(String username,String password) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		loginpage lg = new loginpage(driver);
//		lg.clockloginlauage();
//		lg.clockloginlauage_sure();
		lg.typeusername(username);
		lg.typepassword(password);
		lg.clocklogin();
		return (mainpage) PageFactory.getPage(mainpage.class, driver);
	}
	
}
