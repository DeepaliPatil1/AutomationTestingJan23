package seleniumconcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FourAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://classic.freecrm.com/");
	       driver.findElement(By.name("username")).sendKeys("speedway2016");
	       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Speedway@2016");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       
	       driver.switchTo().frame("mainpanel"); //frame
	       
	    WebElement Contacts =   driver.findElement(By.cssSelector("a[title='Contacts']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(Contacts)
	    .build()
	    .perform();
	    // new contact
	    driver.findElement(By.linkText("New Contact")).click();
	    WebElement Title = driver.findElement(By.name("title"));
	    Select sel = new Select(Title);
	    sel.selectByVisibleText("Miss");
	    //full name
	  driver.findElement(By.id("first_name")).sendKeys("Deepali");
	  driver.findElement(By.id("middle_initial")).sendKeys("Vinod");
	  driver.findElement(By.name("surname")).sendKeys("Patil");
	  
	  // select 
	  
	        WebElement Suffix = driver.findElement(By.name("suffix"));
	        Select Key = new Select(Suffix);
	        Key.selectByValue("Sr.");
	        
	        driver.findElement(By.name("nickname")).sendKeys("Deepu");
	  
	  
	  driver.findElement(By.xpath("(//input[@type='button'])[5]")).click(); 
	  
	  
      
	//driver.switchTo().window(win).getWindowHandles();
	String pwh=driver.getWindowHandle();
	 Set<String>windows=driver.getWindowHandles();
	 for(String win:windows)
	 {
		 if(!win.equals(pwh))
		 {
			 driver.switchTo().window(win);
		 }
	 }
	 
	  
	  
	  
	  driver.findElement(By.cssSelector("#search")).sendKeys("Infosys");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.linkText("Infosys")).click();
	  
	  
	  //posssition Name
	  driver.switchTo().window(pwh);
	  driver.switchTo().frame("mainpanel");
	  
	  driver.findElement(By.id("company_position")).sendKeys("xyz");
	  driver.findElement(By.name("department")).sendKeys("abc");
	  
	  // contact 
	  driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
	  String pwh1=driver.getWindowHandle();
	  
	  Set<String>window=driver.getWindowHandles();
		 for(String win:window)
		 {
			 if(!win.equals(pwh1))
			 {
				 driver.switchTo().window(win);
			 }
		 }
	  driver.findElement(By.name("search")).sendKeys("Ganesh Kakade");
	  driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
	  driver.findElement(By.xpath("(//a['Ganesh Kakade'])[3]")).click();
	  
	  //posssition Name
	  driver.switchTo().window(pwh1);
	  driver.switchTo().frame("mainpanel");
	  
	  driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
	  String pwh2=driver.getWindowHandle();
	  
	  Set<String>windo=driver.getWindowHandles();
	  for(String win:windo)
	  {
		  if(!win.equals(pwh2))
		  {
			  driver.switchTo().window(win);
		  }
	  }
	  
	 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Deepali Patil");
	  driver.findElement(By.cssSelector("input[value='Search']")).click();
      driver.findElement(By.xpath("(//a['Deepali Patil'])[10]")).click();
	  
	  //posssition Name
	  driver.switchTo().window(pwh2);
	  driver.switchTo().frame("mainpanel");
	  
	  //Refereed
	  driver.findElement(By.xpath("(//input[@value='Lookup'])[4]")).click();
      String pwh3=driver.getWindowHandle();
	  
	  Set<String>wind=driver.getWindowHandles();
	  for(String win:wind)
	  {
		  if(!win.equals(pwh3))
		  {
			  driver.switchTo().window(win);
		  }
	  }
	  
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("abc");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("( //a['IT'])[1]")).click();
	  
	//posssition Name
	  driver.switchTo().window(pwh2);
	  driver.switchTo().frame("mainpanel");
	  
	  //name category
		WebElement findkey =  driver.findElement(By.name("category"));
	     Select find = new Select(findkey);
	      find.selectByValue("Friend");
	  
	  
	  WebElement status =  driver.findElement(By.name("status"));
	  Select key = new Select(status);
	  key.selectByIndex(5);
	  
	  driver.findElement(By.id("phone")).sendKeys("1234567891");
	  driver.findElement(By.name("mobile")).sendKeys("022-12345");
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys("123346789");
	  driver.findElement(By.id("fax")).sendKeys("-");
	  driver.findElement(By.id("email")).sendKeys("Demo@123");
	  driver.findElement(By.name("email_alt")).sendKeys("-");
	 
	
	  driver.findElement(By.cssSelector("input[type='radio']")).click();
	  driver.findElement(By.xpath("(//input[@value='N'])[2]")).click();
	  driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();

     
      
    driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("no");
    
    WebElement status1 =  driver.findElement(By.xpath("//select[@name='im_netowrk']"));
	  Select st  = new Select(status1);
	  st.selectByValue("Google Talk");
	  
	  driver.findElement(By.name("skype_id")).sendKeys("no");
	  
	 WebElement satatuskey1 =driver.findElement(By.xpath("(//select[@class='select'])[9]"));
	  Select st1 = new Select(satatuskey1);
	  st1.selectByIndex(4);
	  
	  driver.findElement(By.xpath("//img[@id='f_trigger_c_birthday']")).click();
	  driver.findElement(By.xpath("(//td[@class='title'])[1995]")).click();
	  
	  
	  
	 driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")).click();
	
	       
	}

}
