package basicPrograms;

public class ExceptionThrownFromInnerMostMethod {

	public static void method4() {
		
	//	try {
			System.out.println("method4 started");
		int x = 5/0;
		System.out.println("method4 ended");
	
		/*}
		catch(ArithmeticException e) {
			System.out.println("exception raised is " + e);
			System.out.println("give valid denominator as numbers divided by zero leads to infinity" );
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("exception raised is " + e);

		}*/
	
		System.out.println("method4  completed");
	}

	public static void method3() {
		System.out.println("method3 started");
	//	try {
			System.out.println("method3 ....");
			method4();
		System.out.println("method3 ....");
	//	}
	
	
		
	
	
		System.out.println("method3  completed");
	}

	public static void method2() {
		System.out.println("method2 started");
		method3();
		System.out.println("method2  completed");
	}

	public static void method1() {
		System.out.println("method1 started");
		method2();
		System.out.println("method1  completed");
	}

	public static void main(String[] args) {
		//always handle exceptions to avoid the control coming out of the main application 
		//and handle exceptions appropriately
		try {
		System.out.println("main started");
		method1();
		System.out.println("main completed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
