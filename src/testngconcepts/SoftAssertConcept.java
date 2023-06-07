package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept 
{
	WebDriver driver;
	SoftAssert softassert;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void initialization()
	{
		 softassert = new SoftAssert();
		System.setProperty("webdriver.chrome", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void validateTitleandLogoTest()
	{
		
		String title = driver.getTitle();
		softassert.assertEquals(title,"OrangeHRM");//PASS
		boolean logoStatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		softassert.assertEquals(logoStatus, false);//PASS
		softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	}

}
