package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        
	          driver.get("https://demo.automationtesting.in/Alerts.html");
	          driver.findElement(By.className("analystic")).click();
	          driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
	          
	          Alert alt = driver.switchTo().alert();
	          Thread.sleep(5000);
	          String alertText = alt.getText();
              alt.accept();
                  System.out.println(alertText);

//               if(alertText.contains("I am Alert Box")) 
//               {
//                   System.out.println("test case is pass");
//                }
//
//                  else
//                      {
//                           System.out.println("test case is fail");
//                     }
//	          
	       }

}
