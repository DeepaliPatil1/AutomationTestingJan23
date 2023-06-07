package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCheckBox {

	private static int checbox;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");
	       driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patil");
	       driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	       
	     //  driver.findElement(By.id("checkbox1")).click();
	    //  driver.findElement(By.cssSelector("input[value='Movies']")).click();
	     //  driver.findElement(By.id("checkbox3")).click();
	      
	      // use can used  advance for loop for interviw 
	      
	List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
	/*for( WebElement box : Checkbox)
        	
        {
		    if(box.getAttribute("value").equals("Cricket")||box.getAttribute("value").equals("Hockey")) {
          
       	     box.click();
       	     }
         }*/
	       
	
	       //normal for loop
	
		  for(int i=0; i<Checkbox.size(); i++ )  
		  {
			  Checkbox.get(i).click(); // 0-cricet, 1- movies, 2- hockey
		  }
		    
		    
   
	}

}
