package ToUnderstandConstructor.withoutConstructor;

public class College {
	String collegeName ;
	public void initializeDataMembers(String localVariableCollegeName){
		collegeName = localVariableCollegeName;
		System.out.println("Initializing  college object");
	}
	
	public void displayCollegeName() {
		System.out.println(collegeName);
	}
	
	
	public static void main(String[] args) {
		College college1 = new College();
		college1.initializeDataMembers("Janson");
		college1.displayCollegeName();
	}
}
