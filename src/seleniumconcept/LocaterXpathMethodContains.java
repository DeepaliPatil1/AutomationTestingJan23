package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterXpathMethodContains {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		       ChromeDriver driver = new ChromeDriver();
		       //2nd Methods of xpath is Contains() 
		       //i)Contains with text()
		       /*driver.get("https://demo.automationtesting.in/Register.html");
		       
		       driver.findElement(By.xpath("//label[contains(text(),'Email ')]")).click();
               String data =driver.findElement(By.xpath("//label[contains(text(),'Email ')]")).getText();// xpath method 1)text()
            System.out.println(data);
                                                 */
		       //ii)Contains with attribute
		       
		          
		       
		       driver.get("http://www.facebook.com/");
		      driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
		      // driver.findElement(By.xpath("//a[contains(@id,'u_0']")).click();
		       
		       
	}

}
