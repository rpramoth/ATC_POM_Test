package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeTest
	public void setup(){
		initialisation();
				
	}
	
	@Test
	public void LoginPageTitle(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	
	public void login(){
		homepage=loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
}
