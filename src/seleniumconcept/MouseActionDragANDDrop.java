package seleniumconcept;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragANDDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://jqueryui.com/droppable/");
	       driver.switchTo().frame(0);// frame
	       
	      WebElement source = driver.findElement(By.cssSelector("#draggable"));
	      
	      
	    WebElement destination =  driver.findElement(By.id("droppable"));
	    
	    Actions act = new Actions(driver); // mouse action
	    
//	    act.clickAndHold(source)
//	    .release(destination)
//	    .build()
//	    .perform();
	    
	    act.dragAndDrop(source, destination).perform();
	    
	    
	    
	}

}
