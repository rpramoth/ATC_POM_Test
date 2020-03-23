package trainingWFH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCardScrap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		//	getIndividualScore(driver, "David Warner");
		getTeamScore(driver);

		driver.close();




	}

	public static void getIndividualScore(WebDriver driver, String playerName){

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div/a[contains(text(),'"+playerName+"')]/parent::div/following-sibling::div[contains(@class,'cb-col cb-col-8 text-right')]"));
		System.out.print(playerName);
		for(WebElement e: list){
			System.out.print(e.getText() +"\t");
		}

	}

	public static void getTeamScore(WebDriver driver){

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		for(WebElement e:list){
				System.out.println(e.getText());
		}

	}



}
