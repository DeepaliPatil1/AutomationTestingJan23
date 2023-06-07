package javaconcept;

public class MethodConcept {
	
	//variable - to store value/date
	//method are use program write program logics  
	int empNumber = 44444;
	String dta = "This is my emNumber";
	
	public static void main(String[]args) //static method
	{
		// static area
		MethodConcept mc = new MethodConcept();// object ceration - instantiation
		System.out.println(mc.empNumber); //variable calling
		
		mc.printEmpNumber();//	method declaration																																																																																																													
	}
	
	
	public void printEmpNumber() // instance method
	{
		
		// instance area // method implementation
		System.out.println("This is my emNamber: " + empNumber);
		
	}
	
	
	
	
	
	

}
