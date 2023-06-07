package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocater {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("http://www.facebook.com");
	        driver.findElement(By.name("email")).sendKeys("deepali.shisode77@gmailcom");
	        driver.findElement(By.name("pass")).sendKeys("Deepali@09");
	        driver.findElement(By.name("login")).click();
	        
	        
	        

	}

}
