package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Frames.html");
              
	    //  driver.switchTo().frame("SingleFrame"); // name use
	    //  driver.switchTo().frame(0); //index
	     
	      WebElement frameElement =driver.findElement(By.id("singleframe"));// webelement
	       driver.switchTo().frame(frameElement);
	      driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Speedeway");
	      driver.switchTo().defaultContent();
	      driver.findElement(By.partialLinkText("Practice Site")).click();
	}

}
