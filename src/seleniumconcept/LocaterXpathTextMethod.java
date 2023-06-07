package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterXpathTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/Register.html");
	        String data =driver.findElement(By.xpath("//h2[text()='Register']")).getText();// xpath method 1)text()
            System.out.println(data);
            
            if(data.contains("Register"))
            {
            	System.out.println("we are redirected on register page");
            }
	}

}
