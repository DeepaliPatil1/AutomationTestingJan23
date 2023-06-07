package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\icon\\\\Downloads\\\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://classic.freecrm.com/index.html");
	       
	       driver.findElement(By.cssSelector(".form-control")).sendKeys("speedway@2016"); //4th type of css selector using '.value' 
	       
	       driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Speedway@2016");
       
	       driver.findElement(By.cssSelector(".btn.btn-small")).click();
	}

}
