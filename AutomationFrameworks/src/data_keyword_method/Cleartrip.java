package data_keyword_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
public static void main(String[]args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.cleartrip.com/");
      Thread.sleep(5000);  
      driver.findElement(By.xpath("//div[text()='Tue, Jun 8']")).click();
      driver.findElement(By.xpath("//div[@class=flex-1 ta-right] | [@data-testid='rightArrow']"));
      
    //div[@class='flex-1 ta-right']/following-sibling::svg[@data-testid="rightArrow"]
      
    //div[@class='flex-1 ta-right']/descendant::svg[@data-testid="rightArrow"]
      
      //driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
      Thread.sleep(3000);
      
}
}