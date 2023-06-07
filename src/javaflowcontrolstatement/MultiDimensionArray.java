package javaflowcontrolstatement;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		// single Dimension Array
	//	DataType arrayName[] = {val1, val2, val3};
	//	DataType arrayName[] = new DataType[3];
		
		//multi Dimension Array
		//DatType arrayName[] = {val1, val2, val3},{val1, val2, val3}};
		                     //[0]        [1]
		int numbers [][] = {{1,2,3,4,5},
				           {6,7,8,9,10}, {11,12,13,14,15}};
//		System.out.print(numbers[0][0] + " ");//1
//		System.out.print(numbers[0][1] + " ");
//		System.out.print(numbers[0][2] + " ");
//		System.out.print(numbers[0][3] + " ");
//		System.out.print(numbers[0][4] + " ");
//		
//        System.out.println();
//
//		System.out.print(numbers[1][0] + " ");//6
//		System.out.print(numbers[1][1] + " ");
//		System.out.print(numbers[1][2] + " ");
//		System.out.print(numbers[1][3] + " ");
//		System.out.print(numbers[1][4] + " ");


		for ( int i = 0; i <3; i++) //row
		{
			for(int j=0; j<5; j++)// column
			{
				System.out.print(numbers[i][j]+ " " );
			}
			System.out.println();
		}
	}

}
