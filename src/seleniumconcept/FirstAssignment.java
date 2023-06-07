package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\Downloads\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deepali");
	       driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patil");
	       
	       driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Sambhaji Nagar");
	       driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Demo@gmail.com");
	      driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("1234567899");
	       driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	       
	    
	List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
     
	for( WebElement box : Checkbox)
     	
     {
		    if(box.getAttribute("value").equals("Cricket")||box.getAttribute("value").equals("Hockey")) {
       
    	     box.click();
    	     
    	     }
      }
	       
	
	
	       WebElement skillsDropdown = driver.findElement(By.id("Skills"));
	       
	       Select sel = new Select(skillsDropdown);
	     
	       sel.selectByVisibleText("Java");
	       
	        driver.findElement(By.cssSelector("span[role='combobox']")).click();
	       // List <WebElement> SelectCountry=
	       //driver.findElements(By.xpath("input[type='search']")).sendKeys("India");
	        Thread.sleep(5000);
	     List <WebElement> SelectCountry= driver.findElements(By.xpath("//li[@role='treeitem']"));
	      int numofElements =SelectCountry.size();
           System.out.println(numofElements );
	      
	      for(WebElement element :SelectCountry )// webelements
	      {
	    	String elementTxt = element.getText();
	    	System.out.println(elementTxt);
  	          if(elementTxt.contains("India"))
    	{
    		element.click();
	    		break;
	    	}
	      }	
	       
	    WebElement   DateOfBirthYear = driver.findElement(By.cssSelector("#yearbox"));
	       
          Select Date = new Select(DateOfBirthYear);
            Date.selectByVisibleText("1995");
            
            WebElement DateOfBirthMonth   =  driver.findElement(By.cssSelector("select[placeholder='Month']"));  
            
            Select Dateof = new Select(DateOfBirthMonth);
            Dateof.selectByValue("January");
            
           WebElement DateOfBirthDay =    driver.findElement(By.cssSelector("[placeholder='Day']"));
            Select DateofBirth = new Select(DateOfBirthDay);
            DateofBirth.selectByIndex(1);
            
            
            driver.findElement(By.id("firstpassword")).sendKeys("Demo@123");
            driver.findElement(By.id("secondpassword")).sendKeys("Demo@123");
            
            driver.findElement(By.name("signup")).click();

	}

}
