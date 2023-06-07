package javaflowcontrolstatement;

public class SwitchStatement2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		String userInput = "multiplication";
		
		switch(userInput)
		{
		case"addition":
		{
			int c = a + b;
			System.out.println(c);
			break;
				
		}
		
		case"subtraction":
		{
			int c = a - b;
			System.out.println(c);
			break;
		}
		
		case"multiplication":
		{
			int c = a * b;
			System.out.println(c);
			break;
		}
		case"divition":
		{
			int c = a / b;
			System.out.println(c);
			break;
		}
		
		}

	}

}
