package seleniumconcept;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        
	          driver.get("https://demo.automationtesting.in/Index.html");
	          
	          Thread.sleep(5000);
	          
	          driver.findElement(By.id("btn2")).click();// find out by.id method for url
	          
	          
	          String url = driver.getCurrentUrl();
	          
	          System.out.println(url);
	          
	          // web driver navigation method
	          //refresh
	          //back
	          //Forward
	          
	          driver.navigate().back();
	          System.out.println("we are on index.html page");
	          Thread.sleep(5000); //duration should be used here
	          
	          driver.navigate().forward();
	          System.out.println("we are on register page");
	          
	          Thread.sleep(5000);
	          driver.navigate().refresh();

	}

}
