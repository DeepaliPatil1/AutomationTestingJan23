package javaconcept;
// we can add multiple static block

public class StaticBlock {
	

	public StaticBlock() 
	{
		System.out.println("this is constructoer");
	}
	
	
	
	static
	{
	    System.out.println("this is static block");	
	}
	
	{
		System.out.println("this is Instance Block");
	}
	static
	{
	    System.out.println("this is static block");	
	}
	
	{
		System.out.println("this is Instance Block");
	}
	

	public static void main(String[] args)
	{
		StaticBlock sb = new StaticBlock();
		sb.demo();
		System.out.println("we are learing Static block");
        demo();
        
	}
	
	public static void demo()
	{
		System.out.println("this is demo");
	}

}
