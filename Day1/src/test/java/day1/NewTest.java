package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	RemoteWebDriver driver;
  @Test
  public void f() throws AWTException {
	  Actions act=new Actions(driver);
	  
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement drag=driver.findElementById("draggable");
	  WebElement drop=driver.findElementById("droppable");
	  act.dragAndDrop(drag, drop).perform();
	  Robot robot=new Robot();
	  robot.keyPress(KeyEvent.VK_ALT);
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,75)");
	  //act.moveToElement(driver.findElementById("q")).sendKeys("com").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Selenium\\ProjectImplemtation\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  //driver.get("http://demowebshop.tricentis.com/");
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
