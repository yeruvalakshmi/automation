package data_keyword_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrainyQuoteTest {

	public static void main(String[]args) {
		//open the browser and enter the utl
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.brainyquote.com/");
		//click on authors tab
		 WebElement element = driver.findElement(By.xpath("//a[text()='Authors' and @class='txnav']"));
		 element.click();
		 //Inspect all the author names and store it in a list
		 List<WebElement> allauthors = driver.findElements(By.xpath("//span[@class='authorContentName']"));
		 //Find and click on Mother Teresa
		 for (int i=0;i<allauthors.size();i++)
		 {
			 String test = allauthors.get(i).getText();
			 if(test.equals("Mother Teresa"))
			 {
				 allauthors.get(i).click();
				 break;
				 }
		 }
			 
		 //print all the quotes by Mother Teresa
		 List<WebElement> allquotes = driver.findElements(By.xpath("//a[@title='view quote']"));
		 for(WebElement onequote:allquotes)
		 {
			 String text=onequote.getText();
			 System.out.println(text);
		 }
		 
		
	
	}
}
