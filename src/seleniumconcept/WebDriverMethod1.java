package seleniumconcept;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        
	          driver.get("http://www.facebook.com/login/");
	          
	          String title = driver.getTitle();
	          
	          System.out.println(title);
	          
	          if(title.contains("Log in"))
	          {
	        	  System.out.println("We are on faceboo login page");
	          }
	          
	          

	}

}
