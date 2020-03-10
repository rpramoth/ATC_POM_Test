package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	AddressPage addressPage;
	
	public HomePageTest(){
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
		String homeTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homeTitle, "My account - My Store");
	}
	
	@Test
	public void clickAddress(){
		addressPage=homePage.clickAddress();
	}
	
	@AfterTest
	public void TearDown(){
		driver.quit();
	}
}
