package seleniumconcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Windows.html");
	       
	     String pwh=  driver.getWindowHandle();// single window
	     System.out.println(pwh);
	       
	       driver.findElement(By.cssSelector(".btn.btn-info")).click();
	  Set<String>  windows =  driver.getWindowHandles(); // multiple windows
	  
	       
	   for(String win:windows  )
	   {
		  //System.out.println(win); 
		   if(!win.equals(pwh)) 
		   {
			   driver.switchTo().window(win); // chlild windw
		   }
	   }
	      driver.findElement(By.xpath("//span[text()='Downloads']")).click();
           
		
	}

}
