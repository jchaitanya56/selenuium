package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.GetDriver;
import pages.LoginPage;

public class TC01 {
WebDriver driver;
LoginPage lp;
@Test	
public void login(){
	driver=GetDriver.driverName("chrome");
	driver.get("http://newtours.demoaut.com/");
	lp=PageFactory.initElements(driver,LoginPage.class);
	lp.enterUserName("mercury");
	lp.enterPassword("mercury");
	lp.clickSignIn();
	driver.close();
}
}
