package javaconcept;

public class MethodConcept2 {
//method without any parameters	`
	public static void main(String[] args) 
	{
		
       MethodConcept2 mc2 = new MethodConcept2();
       mc2.login();
       mc2.selectproduct();
       mc2.payment();
       mc2.drliver();
	}
	public void login()
	{
		System.out.println("login in Successfully");
	}
	
	public void selectproduct() 
	{
		System.out.println("Product has been added in Cart");
	}
	
	public void payment() 
	{
		System.out.println("Payment completed Successfully"); 
	}
	
	public void drliver()
	
	{
		System.out.println("Product deliver to user Successfully");
	}

}
