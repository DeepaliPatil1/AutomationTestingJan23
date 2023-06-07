package objectorientedprogrammingsystem;

public class CRMPro
{
	//data stored in(veriable ) and action(method)
	 public static void main(String [] args )
	 {
		 CRMPro pro = new CRMPro();
		
		 pro.login();
		 pro.CreatContact();
		 pro.logout();
	 }
	public void login()
	{
		System.out.println("logged is successfully");
	}
	
	public void CreatContact()
	{
		System.out.println(" Creat Contact successfully");
	}
	
	public void logout()
	{
		System.out.println("logged out is successfully");
	}
	
	 

}
