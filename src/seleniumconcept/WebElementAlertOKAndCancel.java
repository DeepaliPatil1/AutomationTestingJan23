package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlertOKAndCancel {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
            driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
            
            
              Alert alt =  driver.switchTo().alert();
              String alterText = alt.getText();
              alt.dismiss();
              
              System.out.println(alterText);
              
           String labelText =  driver.findElement(By.id("demo")).getText();
           
           if(labelText.contains("OK"))
           {
        	   System.out.println("We click on o buttone");
        	   
           }
           
           else
           {
        	   System.out.println("We click on cancel buttone");
           }
            
	}
	

}
