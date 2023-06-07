package javaflowcontrolstatement;

public class MultiDimensionArray2 {

	public static void main(String[] args) {
		String stdData[][] = {{"RN", "Name"},{"1","xyz"},{"2","abc"}};
		
		for(int i=0; i<3; i++)  // row
		{
			for(int j=0; j<2; j++) // column
			{
			System.out.print(stdData[i][j] + " ");
			}
			System.out.println(); 
		}
		 
	}

}
