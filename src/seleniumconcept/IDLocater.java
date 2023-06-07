package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocater {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/"); 
	        
	      // driver.findElement(By.id("email")).sendKeys("Speedway@123");
	       driver.findElement(By.id("email"));
	       WebElement  skipSignBtn = driver.findElement(By.id("email"));
	       
	       skipSignBtn.sendKeys("demo123.com");
	       
}      

}
