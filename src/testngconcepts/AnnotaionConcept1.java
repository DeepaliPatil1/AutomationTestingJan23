package testngconcepts;

import org.testng.annotations.Test;

public class AnnotaionConcept1 {
  @Test
  public void loginTest() 
  {
	  System.out.println("Login test passed");
  }
  
  @Test
  public void logoTest()
  {
	  System.out.println("Logo test passed");
  }
  @Test
  public void linksTest()
  {
	  System.out.println("links test passed");
  }
  
  @Test
  public void logout()
  {
	  System.out.println("Logout test passed");
  }
}
