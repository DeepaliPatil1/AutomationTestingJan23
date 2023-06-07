package objectorientedprogrammingsystem;

public class ChildEncapulation extends ParentEncapsulation {

	public static void main(String[] args) 
	{
		ChildEncapulation ce = new ChildEncapulation();
		//ce.password = "demo"; // change pass can acces
		//ce.displayCredentials();
		
		ce.getCredentialsInfo();
		
		System.out.println("**************************************");
		
         ce.setCredentialInfo("Admin", "admin@123");
         ce.getCredentialsInfo();
	}

}
