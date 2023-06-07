package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://classic.freecrm.com/");
	       driver.findElement(By.name("username")).sendKeys("speedway2023");
	       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Speedway@2023");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       
	       driver.switchTo().frame("mainpanel"); //frame
	       
	    WebElement Contacts =   driver.findElement(By.cssSelector("a[title='Contacts']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(Contacts)
	    .build()
	    .perform();
	    // new contact
	    driver.findElement(By.linkText("New Contact")).click();

	}

}
