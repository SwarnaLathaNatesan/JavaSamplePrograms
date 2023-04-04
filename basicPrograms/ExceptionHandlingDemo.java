package basicPrograms;

//session 7

import java.util.*;

public class ExceptionHandlingDemo {

	public static void numberDivision() {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nnumerator : ");
		int numerator = sc.nextInt();

		System.out.print("denominator : ");
		int denominator = sc.nextInt();
		int result = (numerator / denominator);
		System.out.println(" result :  " + result);
		System.out.println(" Thank you for entering values");
	//	numberDivision();
	}

	public static void main(String[] commandLineArguments) {
	
		try {

			numberDivision();
			System.out.println("No exception raised as user did not enter zero");

		} catch (ArithmeticException arithmeticException) {
			System.out.println("\nEnter valid denominator other than zero.....2 ");
			//System.out.println(arithmeticException);
			try {
			numberDivision();
			}
			catch(ArithmeticException ae) {
				System.out.println("Exceeded the try limit");
			}

		} catch (Exception exception) {
			System.out.println(" other exceptions ");
			exception.printStackTrace();
		}

		finally {
			System.out.println(
					"finally : statements to execute irrespective of exceptions - eg. Connections closure etc in real time\n");

		}


	}
}

/*
 * Learning : Normal execution of statement happens after exception handling Can
 * we create our own exception? yes
 */

/* what if : denom value is zero */
/* what if : char is entered instead of number */