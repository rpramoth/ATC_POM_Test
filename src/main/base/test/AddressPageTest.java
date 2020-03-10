package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;

public class AddressPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	AddressPage addressPage;
	
	public AddressPageTest(){
		super();
		
	}
	@BeforeTest
	public void setup(){
		initialisation();
		loginPage=new LoginPage();
		addressPage=new AddressPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Test
	public void verifyHomePage(){
		String addressTitle=addressPage.verifyAddressPageTitle();
		Assert.assertEquals(addressTitle, "Address - My Store");
	}
	
	@Test
	public void enterDetails(){
		addressPage.enterDetails(prop.getProperty("fname"), prop.getProperty("lname"), prop.getProperty("address"), prop.getProperty("city"), prop.getProperty("postcode"), prop.getProperty("phone"), prop.getProperty("stateDrop"), prop.getProperty("phone_mobile"), prop.getProperty("alias"), prop.getProperty("company"),prop.getProperty("address2"));
	}
	
	
}
