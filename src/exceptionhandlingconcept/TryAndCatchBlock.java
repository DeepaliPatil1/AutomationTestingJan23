package exceptionhandlingconcept;

public class TryAndCatchBlock {
	//try code: raise risky   code exception
   // Catch code : hadal exception code
	public static void main(String[] args) 
	{
		
		int numbers [] = {1,2,3,4,5};
		int a = 1/1;
		System.out.println(a);
		
		try
		{
			
			System.out.println("We are in try Block"); // if there is exception then code will not show
			
			System.out.println(numbers[4]); //5
		    System.out.println("rest of the coe of try block");
		}
		
		//Exception e = new ArryindexOutBoundsException
		
		
		catch(ArithmeticException ae)
		{
			System.out.println("Please use number > 0 ");
		}
		//Exception e = new ArryindexOutBoundsException
				catch(Exception e)
				{
					System.out.println("Please put value till 4th index");
					//int a = 1/0;
					//System.out.println(a);
				}
		
		
		System.out.println("We are learnng exception handling");
		
		
	}

}
