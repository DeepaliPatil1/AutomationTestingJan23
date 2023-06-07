package objectorientedprogrammingsystem;

public class AccessModifierChild extends AccessModifierParent {

	public static void main(String[] args) {
		
		AccessModifierChild ac = new AccessModifierChild();
		ac.printamount();
	}
	public void demoMethod()
	{
		System.out.println("child class demo method");
	}

}
