package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
WebDriver driver;
@FindBy(name="userName") WebElement name;
@FindBy(name="password") WebElement password;
@FindBy(how=How.XPATH,using="//*[@name='login']") WebElement button;
 
public LoginPage(WebDriver localdriver){
	driver=localdriver;
}
public void enterUserName(String uname){
	name.sendKeys(uname);
}
public void enterPassword(String pass){
	password.sendKeys(pass);
}
public void clickSignIn(){
	button.click();
}
}
