package samplePrograms.AccessSpecifierDemo;

public class Student {
	private int studID;
	
	  String packageLevel;
	 public static final String instituteName = "Janson Instititue of Technology";
		
	public int getStudID() {
	
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setStudID(1111);
	//	instituteName = "JIT";
		System.out.println(stud1.studID);
	}
	
}


