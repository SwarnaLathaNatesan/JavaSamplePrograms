package basicPrograms;

public class VariableDeclarationInsideLoop {

	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			char x[] = {'a'} ;
		}
		
	// what happens when i try to print
	// System.out.println(x[0]);
	}
}
