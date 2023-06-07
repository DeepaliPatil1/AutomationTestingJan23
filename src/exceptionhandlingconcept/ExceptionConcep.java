package exceptionhandlingconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcep {

	public static  void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//Thread.sleep(1000);// check exepyion
		
       try // risky code andal
       {
		FileInputStream file = new FileInputStream("D://Demo.text");
	   } 
       catch (FileNotFoundException e) 
       {
		// exception code handal
		  System.out.println("File is not avaialbe, please add file");
	   }
         
         
		//int a = 1/0;// exception ArithmeticException abnormaly terminated rest of the code and un chec exaption
		
		
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}

}
