package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTextBox {

	//private static char[] btnStatus;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/Register.html");
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");
	      // driver.findElement(By.cssSelector("input[placeholder='First Name']")).clear();
          // driver.findElement(By.cssSelector("#submitbtn")).click(); 
	       
	       driver.findElement(By.id("submitbtn")).isEnabled(); //true
	       
		//System.out.println(btnStatus);
	       driver.findElement(By.id("submitbtn")).click();
	       
	}

}
