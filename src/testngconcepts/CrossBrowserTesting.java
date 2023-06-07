package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{
   WebDriver driver;
   @BeforeMethod
   public void initialization()
   {
   	 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		// driver = new ChromeDriver();
	   System.setProperty("webdriver.edge.driver","");
		
   }
   
   @Test(priority = 1)
   public void googlrSearchTest()
   {
   	driver.get("https://www.google.co.in/");
   	driver.findElement(By.name("q")).sendKeys("Parallel Execution");
   }
   @Test(priority = 2)
   public void yahoorSearchTest()
   {
   	driver.get("https://in.search.yahoo.com/");
   	driver.findElement(By.name("p")).sendKeys("Parallel Execution");
   }
   @AfterMethod
   public void tearDown()
   {
   	driver.close();
   }

   
	
	
}
