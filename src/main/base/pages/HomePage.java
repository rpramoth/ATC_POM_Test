package pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class HomePage extends TestBase{


	@FindBy(xpath="//a[@title='Addresses']")
	WebElement address;
	
	
	@FindBy(xpath="//a[@title='Add an address']")
	WebElement newAddress;
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
		
	}
	
	public AddressPage clickAddress(){
		address.click();
		newAddress.click();
		return new AddressPage();
	}

}
