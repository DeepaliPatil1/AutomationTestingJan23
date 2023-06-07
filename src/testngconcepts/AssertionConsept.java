package testngconcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionConsept {
	
	 WebDriver driver;
	 Properties prop ;
		
		@SuppressWarnings("deprecation")
		
		@BeforeMethod
		public void initiliazation() throws IOException
		{
			
			FileInputStream file = new FileInputStream("C:\\Users\\icon\\eclipse-workspace\\AutomationTestingJan23\\Configition.properties");
			 prop = new Properties();
			prop.load(file);
			
			
			System.setProperty("webdriver.chrome", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
		}
		
		@Test
	  public void validateloginTest() throws InterruptedException 
		{
	       driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));;
	       driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));;
	       driver.findElement(By.cssSelector("[type='submit']")).click();
		   Thread.sleep(5000);
		  // boolean dashboardStatus = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		   String dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		   System.out.println(dashboardText);
		   //hard assert
			Assert.assertEquals(dashboardText, "Dashboard");
			System.out.println("rest of the code");
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}

}
