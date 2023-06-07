package objectorientedprogrammingsystem;

public class Child extends Parent {

	public static void main(String[] args) 
	{
		Child c = new Child();
	    c.ChildDemo();
		c.ParentDemo();
		 
	//	Parent p = new Parent();// we can creat object for parent class but alsways use same name of class
	//	Parent p = new Child(); this is also used
	//	Child c1 = new Parent();// they show error not used
	}
	
	public void ChildDemo()
	{
		System.out.println("This is child method");
	}

}
