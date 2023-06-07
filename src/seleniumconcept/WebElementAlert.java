package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("http://register.rediff.com/register/register.php?FormName=user_details"); 
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
         
	      // direct handal
	       //driver.switchTo().alert().accept();
	       
	       //we can store object in veriable and perform action
	       
	       Alert alt = driver.switchTo().alert();
	      String alertText = alt.getText();//get text
	                       alt.accept();// it will click on ok
	      System.out.println(alertText);
	      
	       if(alertText.contains("Your full name cannot be blank")) 
	       {
	    	   System.out.println("test cans is pass");
	       }
	       
	       else
	       {
	    	   System.out.println("test case is fail");
	       }
	       
	       
	      
	}

}
