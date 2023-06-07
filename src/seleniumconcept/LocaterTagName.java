package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterTagName {

	private static char[] linktTotal;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       
	       // broen links
	        //print this way 1)
//	     int linkTotal = driver.findElements(By.tagName("a")).size();
//	    System.out.println(linkTotal);
	// System.out.println(  driver.findElements(By.tagName("a")).size());
	      
	      // print 2nd way
	       List<WebElement> links= driver.findElements(By.tagName("a"));
	        	   int linkTotal = links.size();
	        	  System.out.println(linktTotal);
	        	  
	        	   for(int i =0; i<linkTotal;i++)
	        	   {
	        
	        		   String link = links.get(i).getAttribute("href");
	        		   System.out.println(link);
	        	   }
	  

	       
	}

}
