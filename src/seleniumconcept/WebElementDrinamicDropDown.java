package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDrinamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.google.in/");
	       
	       driver.findElement(By.name("q")).sendKeys("selenium");
	       
	       Thread.sleep(5000);
	      List<WebElement>serchResult= driver.findElements(By.xpath("//li[@class='sbct']"));
	      
	         
	      int numberofElements = serchResult.size();
	      System.out.println( numberofElements);
	      
	      for(WebElement elements :serchResult )// webelements
	      {
	    	String elementTxt = elements.getText();
	    	System.out.println(elementTxt);
	    	if(elementTxt.contains("seleniumhq"))
	    	{
	    		elements.click();
	    		break;
	    	}
	      }
	       

	}

}
