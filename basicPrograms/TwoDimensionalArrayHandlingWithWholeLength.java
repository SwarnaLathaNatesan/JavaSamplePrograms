package basicPrograms;

public class TwoDimensionalArrayHandlingWithWholeLength {

	public static void main(String[] arg) {

		int matrix1[][] = { { 1, 2, 3 ,22,33}, { 4,5, 6, 44,55}, { 7, 8, 9,77,88 } };
		System.out.println(matrix1.length);
		 
		{
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.println(" matrix element of " + i + " " + j + " is " + matrix1[i][j]);
				
				}
			}
		}
	}
}
