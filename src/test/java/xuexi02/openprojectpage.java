package xuexi02;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

public class openprojectpage {
	private static WebDriver driver;
	
	public static void setdriver(WebDriver drivers){
		driver = drivers;	
	}
	
	public static WebDriver getdriver(){
		return driver;
	}
	public static projectpage open(mainpage mg) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		mg.clickproject();
		return (projectpage) PageFactory.getPage(projectpage.class, driver);
	}
}
