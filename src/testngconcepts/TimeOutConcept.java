package testngconcepts;

import org.testng.annotations.Test;

public class TimeOutConcept {
  @Test(timeOut = 5000)
  public void timeoutTest() 
  {
	 int i = 1;
	 
	 while(i<2)
	 {
		 System.out.println("TestNG");
		 i++;
	 }
	  
	  
  }
}
