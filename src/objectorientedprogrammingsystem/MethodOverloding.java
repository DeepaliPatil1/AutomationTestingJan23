package objectorientedprogrammingsystem;

public class MethodOverloding {

	public static void main(String[] args)
	{
		MethodOverloding mo = new MethodOverloding();
		mo.login("speedway","Demo1");
		

	}
	// multiple aggrument differnt
	//method same but arugument diffrent
	//secquctionofarrgument will be change
	public void login(String username, String password)
	{
		System.out.println("logged in with username password");
	}
	public void login(int otp)
	{
		System.out.println("logged in with otp");
	}
	
	public void login(String googleAccount, int PIN)
	{
		System.out.println("logged in with google Account");
	}
	
	public void login(int PIN,String googleAccount)
	{
		System.out.println("logged in with google Account and PIN");
	}
	

}
