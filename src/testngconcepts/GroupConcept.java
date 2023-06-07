package testngconcepts;

import org.testng.annotations.Test;

public class GroupConcept {
	
	//sanity testing
	//regression testing
	
  @Test(groups = "Regression Test")
  public void logoTest()
  {
	  System.out.println("Logo is displayed");
  }
  @Test(groups = "Regression Test")
  public void titleTest()
  {
	  System.out.println("Title is validated");
  }
  
  @Test(groups = {"Regression Test","Sanity Test"})
  public void validateLoginTest()
  {
	  System.out.println("Logged is successfully");
  }
  
  
  @Test(groups = {"Regression Test", "Sanity Test", "Smoke Test"})
  public void validateCreatContactTest()
  {
	  System.out.println("Contact has been ceeated");
  }
  
  
  @Test(groups = "Regression Test")
  public void validateCreatCompanyTest()
  {
	  System.out.println("Company has been created");
  }
  
  @Test(groups = "Regression Test")
  public void validateLogoutTest()  {
	  System.out.println("Logout is successfully");
  }
  
}
