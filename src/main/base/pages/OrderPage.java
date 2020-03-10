package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class OrderPage extends TestBase {

	@FindBy(xpath="//a[@title='T-shirts']")
	WebElement tshirt;
	
	
	@FindBy(xpath="//a[@title='Add to cart']")
	WebElement addToCart;
	
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement checkout; 
	
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement tnc;
	
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement payment;
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement orderConfirm;
	


public void buyItems() throws IOException{
	tshirt.click();
	addToCart.click();
	checkout.click();
	checkout.click();
	checkout.click();
	tnc.click();
	checkout.click();
	orderConfirm.click();
	
	TakesScreenshot sc=(TakesScreenshot)driver;
	File src=sc.getScreenshotAs(OutputType.FILE);
	File dest =new File("/SeleniumTest/screenshot/1.jpg");
	FileUtils.copyFile(src, dest);
}


}