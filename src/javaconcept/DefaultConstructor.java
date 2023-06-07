package javaconcept;
// if don't declare any constructed and create one o the object then compiler will generate default
public class DefaultConstructor {
	
	int empNumber=12345; // variable declaration

	// Default constructor 
	//compiler will do that
	public DefaultConstructor()
	{
	  super();	
	}
	public static void main(String[] args)
	{
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println(dc.empNumber);

	}

}
