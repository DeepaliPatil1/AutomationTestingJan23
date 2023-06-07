package javaconcept;

public class StaticVariable {
	
	//instance variable
	int number1 = 10;
	
	// static variable
	static int number2 = 20;
    static String orgName = "SpeedwayTech";
	public static void main(String[] args) {
		
		StaticVariable sv = new StaticVariable();
		System.out.println(sv.number1);//10
		System.out.println(sv.number2);//20
		
		sv.number1 = 100;
		sv.number2 = 200;
				
		System.out.println(sv.number1);//100
		System.out.println(sv.number2);//200
		
		StaticVariable svv = new StaticVariable();
		System.out.println(svv.number1);//10
		System.out.println(svv.number2);//200
		
		StaticVariable svvv = new StaticVariable();
		
		
		

	}

}
