package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterPartialLinText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=2276266264688796765&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146388&hvtargid=kwd-10573980&hydadcr=14453_2154373");
           // coplit value used in partialinktext
	       driver.findElement(By.partialLinkText("Conditions of ")).click();
	}

}
