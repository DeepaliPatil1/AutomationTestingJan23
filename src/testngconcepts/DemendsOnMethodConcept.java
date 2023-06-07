package testngconcepts;

import org.testng.annotations.Test;

public class DemendsOnMethodConcept {
  @Test
  public void validateLoginTest() 
  {
	  System.out.println("ogged in successfully");
	 
  }
  
  @Test(dependsOnMethods = "validateLoginTest")
  public void validatecrealContactTest()
  {
	  
	  System.out.println("Contact has been created");
  }
  @Test(dependsOnMethods = "validateLoginTest")
  public void validateCreateCompanyTest()
  {
	  System.out.println("Company has been creadted");
  }
}
