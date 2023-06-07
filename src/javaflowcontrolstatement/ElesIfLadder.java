package javaflowcontrolstatement;

public class ElesIfLadder {
	//chrome
	//goggle
	//firefox
	//

	public static void main(String[] args)
	{
		
		String browser = "edge";
		if (browser.equals("chrome"))
		{
			System.out.println("we are using chrome browser for testing");
		}
		
		else if(browser.equals("firefox"))
		{
			System.out.println("we are using firefox browser for testing");
		}
		else if(browser.equals("edge"))
		{
			
			System.out.println("we are using edge browser for testing");
		}
		else if (browser.equals("safari"))
		{
			System.out.println("we are using safari browser for testing");
		}
		
		else
		{
			System.out.println("Please select void brower");
		}
		
	}

}
