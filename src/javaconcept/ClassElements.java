package javaconcept;

public class ClassElements {
	
	int a;
	int b;
	String orgNmae = "SpeedwayTech";
	 /*Class Element
	  * *Variable
	  * method
	  * constructor
	  * instance block
	  * static block
	  * 
	  */
	//main method
	public static void main(String[] args)   // static area
	{
		// a = 1;
		//stem.out.println(a);
		// a1 = 2;
		//stem.out.println(a1);
     //ystem.out.println("this is main method");
         /*  int a = 10;
           int b = 2;
           int c = a + b;
           System.out.println(c);*/ 
		
		//substraction
		
		ClassElements ClassObject1 = new ClassElements(); //We are creating object of class
		
		ClassObject1.a = 10;
		ClassObject1.b = 20;
		int c;
		c = ClassObject1.b-ClassObject1.a;
		System.out.println(ClassObject1.orgNmae);
		System.out.println(c);
		
		
      
	}
	
	// demo method - action perform 
	public void addition() //instance / non static area
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println(orgNmae); 
		
		System.out.println("Thr method will perform addition");
	}
}
