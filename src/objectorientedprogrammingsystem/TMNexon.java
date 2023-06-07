package objectorientedprogrammingsystem;

public class TMNexon extends Nexon {

	public static void main(String[] args) {
		TMNexon tmnexon = new TMNexon();
		tmnexon.engine();
		tmnexon.wheels();
		tmnexon.color();
		tmnexon.sunroof();
		tmnexon.ADAS();
	}

	@Override
	public void sunroof() {
		System.out.println("TMNexon varient have sunroof");
	}
	
	public void ADAS()
	{
		System.out.println("Nexon car dose not have ADAS feature");
	}

}
