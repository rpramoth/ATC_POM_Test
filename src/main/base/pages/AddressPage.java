package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class AddressPage extends TestBase{

	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="phone")
	WebElement phone;

	@FindBy(id="address2")
	WebElement address2;
	
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement stateDrop;
	
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;
	
	@FindBy(id="alias")
	WebElement alias;
	
	@FindBy(id="submitAddress")
	WebElement submitAddress;
	
	
	public String verifyAddressPageTitle(){
		return driver.getTitle();
		
	}
	
	public void enterDetails(String firstname, String lastName,String address1, String city1,String state1, String postcode1,
			String phone1, String mobile, String alias1,String company1,String address21){
		fname.clear();
		fname.sendKeys(firstname);
		
		lname.clear();
		lname.sendKeys(lastName);
		
		company.clear();
		company.sendKeys(company1);
		
		address.clear();
		address.sendKeys(address1);
		
		address2.clear();
		address2.sendKeys(address21);
		
		city.clear();
		city.sendKeys(city1);
		
		Select select =new Select(stateDrop);
		select.selectByVisibleText(state1);
				
		postcode.clear();
		postcode.sendKeys(postcode1);
		
		phone.clear();
		phone.sendKeys(phone1);
		
		phone_mobile.clear();
		phone_mobile.sendKeys(mobile);
		
		alias.clear();
		alias.sendKeys(alias1);
		
		
		submitAddress.click();

	}	
		
	}
	
	
