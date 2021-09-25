package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsofTestNG {
	
	@Test(priority=1)
	public void run()
	{
		Reporter.log("Run method",true);
		
	}
	
	@Test(enabled=false)
	public void bun()
	{
		Reporter.log("Bun method",true);
		
	}
	@Test(priority=3)
	public void gun()
	{
		Reporter.log("Gun method",true);
		
	}
	
}
