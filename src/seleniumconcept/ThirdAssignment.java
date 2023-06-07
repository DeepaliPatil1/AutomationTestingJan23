package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://classic.freecrm.com/");
	       driver.findElement(By.name("username")).sendKeys("speedway2016");
	       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Speedway@2016");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       
	       driver.switchTo().frame("mainpanel");
	       
	       //driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")).click();
	       driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
	}

}
