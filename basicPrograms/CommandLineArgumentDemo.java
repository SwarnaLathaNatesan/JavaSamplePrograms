//session 7
public class CommandLineArgumentDemo {
	public static void main(String[] commandLineArguments) {

		// commandLineArguments is the array that gets created when you pass command
		// line arguments
		// length is the data member that contains the number of array elements

		System.out.println("User entered values are " + commandLineArguments.length);

		/*
		 * for (int i = 0; i < commandLineArguments.length; i++) {
		 * System.out.println("User entered values are " + commandLineArguments[i]);
		 * 
		 * System.out.println("User entered values is printed ....."); }
		 */

		String y = commandLineArguments[0];
		
		/*
		 * //Wrapper Class int x = Integer.parseInt(commandLineArguments[1]); Integer i
		 * = 2; i.toString();
		 */
		System.out.println("User entered values is printed ....." + y);
	//	System.out.println("User entered values is printed ....." + x);
		
		//RuntimeException is possible?
		
		//func1 ()
	}
	
	/*
	 * func1 { func2() next..clone(). }
	 * 
	 * func2 { --- --- Exception --
	 * 
	 * }
	 */
	
	
}
