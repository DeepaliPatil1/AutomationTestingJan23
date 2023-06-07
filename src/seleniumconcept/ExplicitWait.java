package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	       
	       driver.findElement(By.xpath("//button[text()='Remove']")).click();
	       // ExplicitWait  
	     // WebDriverWait wait = new WebDriverWait(driver,100);
	      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']")));
	       
	       driver.findElement(By.xpath("//button[text()='Add']")).click();
	       System.out.println("Test case is pass");
	       

	}

}
