package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {
static WebDriver driver;

public static WebDriver driverName(String browserName){
	if (browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Selenium\\ProjectImplemtation\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	return driver;
}
}
