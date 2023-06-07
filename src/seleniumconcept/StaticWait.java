package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		System.out.println("1");
		Thread.sleep(10000); // static wait
		System.out.println("2");*/
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		       ChromeDriver driver = new ChromeDriver();
		       driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		       
		       driver.findElement(By.cssSelector("[type='button']")).click();
		   // 1sc
		       //2sc
		       Thread.sleep(25000);// static wait 
		        
		       
              String msgText =  driver.findElement(By.id("message")).getText();
              
              System.out.println(msgText);
              
              driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
              Thread.sleep(25000);// static wait 
              //1 sec
              //2sec
             String enbaleText = driver.findElement(By.xpath("//p[contains(text(),'It')]")).getText();
             System.out.println(enbaleText);
            
             
	}
	

}
