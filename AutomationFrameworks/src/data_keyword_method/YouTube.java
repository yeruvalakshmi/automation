package data_keyword_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe/");
		      WebDriver driver = new FirefoxDriver();
		      driver.manage().window().maximize();
		      driver.get("https://www.youtube.com/");
		      Thread.sleep(5000);  
		 WebElement searchTB = driver.findElement(By.xpath("//input[@id='search']"));
		   searchTB.sendKeys("butta bomma song by david warner");
		   
		   driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		  //searchTB.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//a[@id='video-title' and @title='#ButtaBomma ft. David Warner and Candice Warner | ButtaBomma | SunRisers Hyderabad | SRH']")).click();
	
	}
}


