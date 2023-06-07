package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterCSSSelector1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/Register.html");
	       
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");//1st type css selector useing tagname
	       
	       driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Patil");// 2nd type of css selector not using tag name  
            
	       driver.findElement(By.cssSelector("#submitbtn")).click();//3 type of css selectro when id is provider in webelement DOM used ' #'
	}

}
