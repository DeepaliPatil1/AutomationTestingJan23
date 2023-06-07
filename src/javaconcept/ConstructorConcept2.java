package javaconcept;

public class ConstructorConcept2 {

	int empNumber; // variable declaration
	
	public ConstructorConcept2(int num) //Parameterize constructed 
	{
		empNumber = num; // value initialization
	}
	
	/*public ConstructorConcept2() // same value provide
	{
		empNumber = 4444; //value initialization 
	}
	*/
	
	
	public static void main(String[] args) 
	{
		ConstructorConcept2 cc2 = new ConstructorConcept2(55555);
		System.out.println(cc2.empNumber);
		//cc2.addEmpNumber();

	}
	
	/*public void addEmpNumber()
	{
		empNumber = 12345; // Initialization
		System.out.println(empNumber);
	}
*/
}
