package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loctorXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        
	          driver.get("https://demo.automationtesting.in/Register.html");
	          
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Demo");// using xpath atribut
                                                                                             //1st way of find xpath using tagname
	
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Demo@123");// 2 way using full xpath copy this is type of xpath is absolute xpath
	}
}
