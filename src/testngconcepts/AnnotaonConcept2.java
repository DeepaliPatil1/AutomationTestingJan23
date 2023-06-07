package testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotaonConcept2 {
	
	
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suit annotation");
	}
	
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before test annotation");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class annotation");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method annotation");
	}
	
 
	@Test
     public void loginTest() 
	  {
		System.out.println("Login test passed");
      }
	
	
	 
	@AfterSuite
	public void as()
	{
		System.out.println("After suit annotation");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("After test annotation");
	}
	

	@AfterClass
	public void ac()
	{
		System.out.println("After class annotation");
	}
	

	@AfterMethod
	public void am()
	{
		System.out.println("After method annotation");
	}
	

	
}
