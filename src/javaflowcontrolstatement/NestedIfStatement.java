package javaflowcontrolstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		String state = "Maharashtra";
		int age = 21;
		
		if(state.equals("Maharashtra"))
		{
			if (age>18)
			{
				System.out.println("you are eligible for voting");
			}
			
			else
			{
				System.out.println("yor are underaged");
			}
		}	
			
			else
			 {
				System.out.println("you are not Maharashtrian");
		     }	
			
			System.out.println("Thank you");
		

	}

}
