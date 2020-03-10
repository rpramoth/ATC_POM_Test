package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="email")
	WebElement name;
	
	@FindBy(id="passwd")
	WebElement pawd;
	
	@FindBy(id="SubmitLogin")
	WebElement submit;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
public HomePage login(String un, String pwd){
	name.sendKeys(un);
	pawd.sendKeys(pwd);
	submit.click();
	
	return new HomePage();
	
}


	
}
