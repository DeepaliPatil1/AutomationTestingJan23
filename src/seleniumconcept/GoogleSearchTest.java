package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class GoogleSearchTest {

	public static void main(String[] args) {
		  // chrome browser
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
        // to load the web page
          driver.get("http://www.facebook.com/login/");
          driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
          driver.findElement(By.name("pass")).sendKeys("Demo123");
          driver.findElement(By.name("login")).click();
          String title = driver.getTitle();
          System.out.println(title);
	      
	}

}
