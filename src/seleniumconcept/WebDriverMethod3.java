package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod3 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
		       ChromeDriver driver = new ChromeDriver();
		       driver.get("https://demo.automationtesting.in/Windows.html");
		       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		       Thread.sleep(5000);
		       driver.quit();
		        
	}

}
