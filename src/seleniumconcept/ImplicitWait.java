package seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       //implicitwait
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// implicitwait use for all the web element pplicable
	       // also now dynamic wait ot globale waits or silinium waits
	       
	       driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	       driver.findElement(By.cssSelector("[type='button']")).click();
		   // 1sc
		       //2sc
		       
		        
		       
              String msgText =  driver.findElement(By.id("message")).getText();
              
              System.out.println(msgText);
              
              driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
             
              //1 sec
              //2sec
             String enbaleText = driver.findElement(By.xpath("//p[contains(text(),'It')]")).getText();
             System.out.println(enbaleText);
            
             

	}

}
