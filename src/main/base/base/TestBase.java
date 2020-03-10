package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase()  {
		try{
		 prop=new Properties();
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/SeleniumTest/Config/config.properties");
		prop.load(fi);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public static void initialisation(){
		
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
						
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
