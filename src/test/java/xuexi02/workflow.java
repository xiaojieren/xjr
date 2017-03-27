package xuexi02;


import org.openqa.selenium.WebDriver;

public class workflow {
	
	private static WebDriver driver;
	
	public static void setdriver(WebDriver drivers){
		driver = drivers;	
	}
	
	public static WebDriver getdriver(){
		return driver;
	}
	
	public static void openbug() throws Exception{
		openloginpage.setdriver(driver);
		mainpage mg = openloginpage.login("admin", "123456");
		openprojectpage.setdriver(driver);
	    projectpage pg = openprojectpage.open(mg);
	    Thread.sleep(2000);
	
	    pg.clickbug();
	    Thread.sleep(2000);
	    pg.clicksubmitbug();
	}
	
}
