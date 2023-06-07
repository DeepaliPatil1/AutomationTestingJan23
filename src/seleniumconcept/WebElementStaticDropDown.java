package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementStaticDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");
	       driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patil");
	       driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	       
	    
	List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
	for( WebElement box : Checkbox)
        	
        {
		    if(box.getAttribute("value").equals("Cricket")||box.getAttribute("value").equals("Hockey")) {
          
       	     box.click();
       	     }
         }
	       //dropdown 1)staticDrop Down
	
	
	       WebElement skillsDropdown = driver.findElement(By.id("Skills"));
	       
	       Select sel = new Select(skillsDropdown);
	     //  used any one 
	      // sel.selectByIndex(0);
	     //  sel.selectByValue(null);
	      // sel.selectByVisibleText(null);
	       //sel.selectByIndex(7);
	       //sel.selectByVisibleText("Java");
	       sel.selectByValue("HTML");

	}

}
