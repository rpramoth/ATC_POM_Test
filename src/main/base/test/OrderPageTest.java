package test;

import org.testng.annotations.BeforeTest;

import base.TestBase;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	AddressPage addressPage;
	OrderPage orderPage;
	
	public OrderPageTest(){
		super();
		
	}
	@BeforeTest
	public void setup(){
		initialisation();
		loginPage=new LoginPage();
		addressPage=new AddressPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	public void orderItem(){
		orderPage.buyItems();
	}
}
