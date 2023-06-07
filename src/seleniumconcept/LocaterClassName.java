package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://classic.freecrm.com/index.html");
	       
	       driver.findElement(By.className("from-control")).sendKeys("demo@123");
	      driver.findElement(By.className("from-control")).sendKeys("demo");


	}

}
