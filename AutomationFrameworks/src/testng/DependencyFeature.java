package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {
	@Test(priority=1)
	public void transfer()
	{
		Assert.fail();//fails the test with no message
		Reporter.log("Transferred Successfully",true);
		
	}
	@Test(priority=2,dependsOnMethods="transfer")
	public void delete()
	{
		Reporter.log("Deleted Successfully",true);
		
	}

}
