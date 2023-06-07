package objectorientedprogrammingsystem;

public   class SBI extends RBI {


		
		public static void  main(String [] args)
		{
	    SBI sbi = new SBI();
	    sbi.withdraw();;
	   sbi.nrfEmpployee();
		}
	
		@Override
		public void withdraw() {
			System.out.println("User can withdrow money");
		}
		@Override
		public void dposit() {
			System.out.println("User can dposit money");
			
		}

}
