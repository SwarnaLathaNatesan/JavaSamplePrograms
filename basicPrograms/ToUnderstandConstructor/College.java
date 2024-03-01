package ToUnderstandConstructor;

public class College {
	String collegeName ;
	public College(String localVariableCollegeName){
		collegeName = localVariableCollegeName;
		System.out.println("In constructor of college");
	}
	
	public void displayCollegeName() {
		System.out.println(collegeName);
	}
	
	
	public static void main(String[] args) {
		College college1 = new College("Janson");
		college1.displayCollegeName();
	}
}
