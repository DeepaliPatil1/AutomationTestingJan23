package testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
 
	@BeforeMethod
	public void initilization()
	{
		System.out.println("Browser instancer created");
	}
	
	@Test
  public void loginTest()
	{
		System.out.println("we are performing login");
    }
	@Test
	  public void logoutTest()
		{
			System.out.println("we are validating logo");
	    }
	@AfterMethod
	public void tearDonw()
	{
		System.out.println("Browser instance closed");
	}
}
