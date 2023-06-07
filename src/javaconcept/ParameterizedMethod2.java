package javaconcept;

public class ParameterizedMethod2 {
	//1st property
	int empNumber = 55555;
    //2nd property
	//this key word not used in static area
	public static void main(String[] args) {
		
		ParameterizedMethod2 pm = new ParameterizedMethod2();
		pm.printID(12345);
        int total = pm.add(022, 045);
       System.out.println("Method execution is complited returned value is :"+total);
	   pm.deposit();
	   System.out.println("Transaction status is success");
	}
	
	
	public void printID(int empNumber) 
	{
		System.out.println(empNumber);
		System.out.println(this.empNumber);// 3rd property
		
	}
	public int add(int a, int b)
	{
		int c; //declaration
		c = a + b;
		return c;
	}
	
	public String deposit()
	{
		System.out.println("deposit completed successfully");
		return "success";
	}	
	

}
