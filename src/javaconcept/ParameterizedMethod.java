package javaconcept;

import java.util.Scanner;

public class ParameterizedMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter your name:");
		
		String nameData = scan.nextLine();
		
		System.out.println("Please Enter your address:");
		String address = scan.nextLine();
		
		System.out.println("Please Enter your mobNumber:");
		int mobNumber = scan.nextInt();
				
		ParameterizedMethod pm = new ParameterizedMethod();
		pm.createContact();
		
		pm.add();// parameter method 1 example
       pm.add(30,40);// parameter method 2 example
        
       pm.createContact("Speeway Tech", "PuneCity", 1234567891);
	}
	
	public void add() 
	{
	int a = 50;
	int b = 30;
	int c = a + b;
	System.out.println("Addition of a and b is : " +c);
	}
	
	public void add(int num1, int num2)
	{
		int a = num1;
		int b = num2;
		int c = a + b;
		System.out.println("Additoion ofa and b is :" +c);
		
	}
	public void createContact()
	{
		
		String name = "Deepali Vinod Patil ";
		String address = "Sambhajinager";
		int mobNum = 951833429;
	    System.out.println(name);
	    System.out.println(address);
	    System.out.println(mobNum);
	}
	
	public void createContact(String name, String address, int  mobNumber)
	
	
	{
		System.out.println(name + address + mobNumber);
	}
	
	

}
