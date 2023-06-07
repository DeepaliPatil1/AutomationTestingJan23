package javaconcept;
//Execution during object creation

public class InstanceBlock {
	
	int num;
	
	
	public InstanceBlock()
	{
		System.out.println("this is argument constructer");
	}
	
	public InstanceBlock(String Deepali)
	{
		System.out.println("this is paramiterise constructor");
		System.out.println(Deepali);
	}

	public static void main(String[] args)
	{
		InstanceBlock ib1 = new InstanceBlock();
		System.out.println(ib1.num);//0

		InstanceBlock ib2 = new InstanceBlock("Deepali vinod patil");
		

	}
	
	//Instance Block
	//multiple time add Instance Block
	{
		
		System.out.println("this is Instance Block");
		num = 20;
	}

	
	
	{
		System.out.println("this is 2nd Instance Block");
	}

}
