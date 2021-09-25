package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionFeature {

	@Test
	public void assertLoginPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String loginTitle = driver.getTitle();
      Assert.assertEquals(loginTitle, "actiTIME - Login");
       //SoftAssert sa = new SoftAssert();
       //sa.assertEquals(loginTitle,"actiTIME - Login");
       Thread.sleep(4000);
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       //sa.assertAll();     		
				
	}
}
