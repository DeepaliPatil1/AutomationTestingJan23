package seleniumconcept;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDriverMethodFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	     //  driver.get("https://classic.freecrm.com/");
	      
	    //   driver.findElement(By.className("form-control")).sendKeys("Demo@123");
        //   driver.findElement(By.name("password")).sendKeys("Demo");
           driver.get("http://www.google.co.in/");
           
           driver.findElement(By.name("q")).sendKeys("selenium");
           
           Thread.sleep(5000);
           
       //    System.out.println(  driver.findElements(By.className("sbct")).size() );
           
         
       List<WebElement> googleSearchResult =    driver.findElements(By.className("sbct"));
       // looping statement
       
       int eleSize = googleSearchResult.size();
       System.out.println(eleSize);
       
       
      for(int i = 0; i<eleSize;i++)
      {
    	 String value = googleSearchResult.get(i).getText();
    	 System.out.println(value);
      }
       
           
	}

}
