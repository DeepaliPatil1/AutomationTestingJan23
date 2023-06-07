package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementradioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");
	       driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patil");
	      // driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	       boolean rdoBtnStatus = driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
	         
	       if(rdoBtnStatus==false)
	       {
	    	  driver.findElement(By.xpath("//input[@value='FeMale']")).click(); 
	       }
	       
	       driver.findElement(By.id("submitbtn")).isEnabled(); //true
	       
		
	       driver.findElement(By.id("submitbtn")).click();
	       
	       
	       
		

	}

}
