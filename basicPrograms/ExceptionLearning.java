package basicPrograms;

class ExceptionLearning {
	public static void main(String[] args) {
		try {
			// code that generates exception
			int divideByZero = 15 / 0;
		}

		catch (ArithmeticException e) {
			// System.out.println("ArithmeticException => " + e.getMessage());

			try {
				System.out.println("Oops , led to an exception");
				System.out.println("Do not give any zero in denominator");
				int divideByZero = 15 / 0;
				System.out.println(
						"Oops ! gave zero in denominator? Hence application quit happen and this statement becomes not reachable");
			}
	
			catch (ArithmeticException ea) {
				System.out.println("ArithmeticException within catch => " + e.getMessage());
			} catch (NullPointerException npe) {
				System.out.println("NullPointerException within catch => " + e.getMessage());
			} catch (NegativeArraySizeException nase) {
				System.out.println("NegativeArraySizeException within catch => " + e.getMessage());
			} 
			catch (Exception exceptionObj) {
				System.err.println(exceptionObj);
			}

		}

		finally {
			try {
				System.out.println("Visit_us_again");
				System.out.println("Do not give any zero in denominator");
				int divideByZero = 15 / 0;
				System.out.println(
						"Oops ! gave zero in denominator? Hence application quit happen and this statement becomes not reachable");
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException within finally => " + e.getMessage());
			}
		}
	}
}