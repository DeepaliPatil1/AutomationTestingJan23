package testngconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class PropertiesConcept 
{

	 WebDriver driver;
	 Properties prop ;
		
		//@SuppressWarnings("deprecation")
		
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
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}
}
