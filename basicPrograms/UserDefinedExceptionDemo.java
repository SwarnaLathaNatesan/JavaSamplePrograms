package basicPrograms;

 class NegativeNumberException extends Exception {
	  public NegativeNumberException(String message) {
	    super(message);
	  }
	}

	public class UserDefinedExceptionDemo {
	  public static void main(String[] args) {
	    int number = -5;
	    try {
	      if (number < 0) {
	        throw new NegativeNumberException("Number cannot be negative");
	      }
	      System.out.println("Number is: " + number);
	    } catch (NegativeNumberException e) {
	      System.out.println("Error: " + e.getMessage());
	    }
	  }
	}
