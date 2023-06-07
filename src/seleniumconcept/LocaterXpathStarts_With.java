package seleniumconcept;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterXpathStarts_With {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.facebook.com/");
	       driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
	       
	       driver.findElement(By.xpath("//input[starts-with(@id,'u_')]")).sendKeys("Demo");

	}

}
