package objectorientedprogrammingsystem;

public class ParentEncapsulation 
{
//	// binding single inhirent / unit
//	String username = "speedway2016";
//     String password = "Speedway@2016";
//     public void   displayCredentials()
//	  {
//		  System.out.println(username);
//		  System.out.println(password);
//	  }
	
	// when using private class cant be access other class
	private  String username = "speedway2016";
	private  String password = "Speedway@2016";
	  
	  
	  public void   getCredentialsInfo()
	  {
		  System.out.println(username);
		  System.out.println(password);
	  }
	  
	  public void  setCredentialInfo(String uname, String pwd)            
	  {
		  username = uname;
		  password = pwd;
	  }
}
