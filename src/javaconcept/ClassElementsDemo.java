package javaconcept;

public class ClassElementsDemo {
	
	int a;
	int b;
	String orgName = "SpeedwayTech";
	
	// static variable
	static int num = 20;

	public static void main(String[] args) {
		ClassElementsDemo object1 = new ClassElementsDemo();
		object1.a = 100;
		object1.b = 200;
		int c;
		c = object1.b-object1.a;
		System.out.println(c);
		
		System.out.println(object1.orgName);
		
		System.out.println(num);//direct access
		
		ClassElementsDemo.num = 100;// class name reference
		System.out.println(num);
		
		object1.num = 1000; //object reference
		System.out.println(num);
		
		
		
		

	}
	
	public void addition()
	
	{
		ClassElementsDemo object2 = new ClassElementsDemo();
		a = 10;
		b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println(orgName);
		System.out.println(num);
		
		System.out.println(num);
		System.out.println(object2.num);
		ClassElementsDemo.num = 50;
		System.out.println(num);
	}

}
