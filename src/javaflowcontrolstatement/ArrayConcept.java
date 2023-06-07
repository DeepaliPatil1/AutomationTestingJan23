package javaflowcontrolstatement;

public class ArrayConcept {

	public static void main(String[] args) {
		//1st way declaration array
		int [] empId  = {1,2,3,4,5}; //declaration and initialization // [] declare after or before
		
		System.out.println(empId[4]); // Array value read hear[]<-
		
		
		//2st way declaration array
		int empId1 [] = {100,200,300,400,500};
		
		for (int i = 1;i<5; i++)
		{
			System.out.println(empId1[i]);
		}
		
		//3st way declaration array
		int empId3[] = new int [5];
		
		 empId3 [0] = 100;
		 empId3 [1] = 200;
		 empId3 [2] = 300;
		 empId3 [3] = 400;
		 empId3 [4] = 500;
		 
		 for (int i = 0;i<5; i++)
			{
				System.out.println(empId1[i]);
			}
		 
		 String [] empName = {"Deepali", "vinod","Manushree"};
		 
		 // for  each loop - advance for loop
		 
		/* for(String name : empName)
		 {
			 System.out.println(name);
			 
		 }*/
		 
		 for (int i = 0;i>2; i++)
			{
				System.out.println(empName[i]);
			}
		
         
	}

}
