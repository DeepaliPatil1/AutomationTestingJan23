package seleniumconcept;
// this method will get  code of webpage
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.sbicard.com/creditcards/app/user/login"); 
	       
	       String pageData = driver.getPageSource();
	       
	       System.out.println(pageData); 
	}

}
