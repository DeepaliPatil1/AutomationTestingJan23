package javaflowcontrolstatement;

public class SwichStatement {

	public static void main(String[] args) 
	{
	// a e i o u
    //exact match value
		char inputValue = 'a'; // A not apply
		switch(inputValue)
		{	
		case 'a':
		{
			System.out.println("a is vowel");
			break; // executing purposes
		}
	
		case 'e':
		{
			System.out.println("e is vowel");
		     break;
			
		}
		
		case 'i':
		{
			System.out.println("i is vowel");
		     break;
			
		}
		case 'o':
		{
			System.out.println("o is vowel");
		     break;
			
		}
		case 'u':
		{
			System.out.println("u is vowel");
		     break;
			
		}
		default :
		{
			System.out.println("This alphabet is not vowel");
		}
			
		}
	}
}
