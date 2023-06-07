package objectorientedprogrammingsystem;

public class MagerpattaHDFCBranch extends SBI {

	public static void main(String[] args) {
		MagerpattaHDFCBranch hdfc = new MagerpattaHDFCBranch();
		hdfc.dposit();
		hdfc.withdraw();
		hdfc.nrfEmpployee();

	}

	@Override
	public void withdraw() {
		System.out.println("User can withdraw money");
	}

	@Override
	public void dposit() {
		
		System.out.println("User can deposit money");
	}

	


}
