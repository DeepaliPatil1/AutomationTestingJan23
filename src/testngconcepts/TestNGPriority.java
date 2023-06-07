package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPriority {
	WebDriver driver;
	@BeforeMethod
	public void initiliazation()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.google.co.in/");
	}
	
	@Ignore
	@Test(priority = 1)// -1,0lower priority is the higher priority
	public void validateGoogleSearchTest()
	{
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	
	@Test(priority = 2)
	public void validateGmailLinkTest()
	{
		boolean status = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(status);
	}
	@Test(priority = 3,enabled = false)
	public void validateImageLinkTest()
	{
		boolean linkstatus =driver.findElement(By.linkText("Images")).isDisplayed();
		System.out.println(linkstatus);
	}
	
	
	@Test(priority = 4)
  public void validateGoogleLogoTest() 
	{
		boolean logostatus = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(logostatus);
		
     }
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
