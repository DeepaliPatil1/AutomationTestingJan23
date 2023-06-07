package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlertwithTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Alerts.html");
	       driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	       driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
           
	       Alert alt = driver.switchTo().alert();
	       alt.sendKeys("Speedway");
	       alt.accept();
	    //   alt.dismiss();
	       
	       
	}

}
