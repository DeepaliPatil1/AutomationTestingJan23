package javaconcept;
//type of  Constructor 1)defect constructor
                      // 2)user defined constructor
public class ConstructerConcept {
	
     String orgName = "SpeedwayTech";
     
     public ConstructerConcept(int a, int b)// class name and constructor name should be same
     {
    	 int sum;
    	 sum = a + b;
    	 System.out.println(sum);
    	System.out.println("we are learning constructor concept"); //not allow return type 
     }
     
	public static void main(String[] args) 
	{
		
		 ConstructerConcept cc = new  ConstructerConcept(25, 26);// 1) creating object
		 
		 System.out.println(cc.orgName); //2) printing orgName 
		 
		 cc.demo();//3) calling demo method
	}
	
	public void demo()
	{
		System.out.println("this is demo method");
	}

}
