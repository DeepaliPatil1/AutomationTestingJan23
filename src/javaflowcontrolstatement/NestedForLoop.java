package javaflowcontrolstatement;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		 *
		 * *
		 * * *
		 * * * *
		 */
		for(int i = 1 ; i<=5 ; i++) //to handle rows
		{
			for(int j = 1 ; j<=i ; j++) // to handle column
			{
				System.out.print("*");
			}
			
			     System.out.println();
			
		}
		for(char i =1 ; i<=5; i++) //to handle rows
		{
			for(char j = 1 ; j<=i ; j++) // to handle column
			{
				System.out.print("AB");
			}
			
			     System.out.println();
			   char alph = 'A' ;
			   alph ++;
		}
		
		

	}

}
