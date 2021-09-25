package goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelGoibibo {

   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		Thread.sleep(3000);
       driver.findElement(By.xpath("//a[@href='/hotels/']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//h4[text()='India']]")).click();
       //div[@class='SearchBlockUIstyles__RadioButtonWrap-sc-fity7j-4 eEVxPE']
      WebElement whereTB = driver.findElement(By.xpath("//input[@id='downshift-1-input']"));
      whereTB.sendKeys("Vijayawada");
      whereTB.sendKeys(Keys.DOWN);
      whereTB.sendKeys(Keys.ENTER);
      Thread.sleep(5000);
     //WebElement checkinTB = driver.findElement(By.xpath("//div[text()='Check-in']/following-sibling::h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-14 hAEfdZ kSflmU']")).click();
     //driver.findElement("By.xpath=("//span[text()='31']");	      
    			       
	}

}
