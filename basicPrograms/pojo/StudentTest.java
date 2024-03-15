package pojo;

public class StudentTest {
	public static void main(String[] args) {
		//stud1 : object reference variable
		Student stud1 = new Student();
		stud1.setStudID(17);
		stud1.setStudName("arjun");
		
		Student[] studArray = new Student[62];
		
		for (int i=0;i<62; i++) {
		studArray[i] = new Student();
		studArray[i].setStudID(i+1);
		
		studArray[i].setStudName("name of " + (i+1));
		
		}
		
		
		
		System.out.println(stud1.getStudID());
		System.out.println(stud1.getStudName());
		
		for ( Student stud :studArray ) {
			//stud.instName = "JIT";
			System.out.println(stud.getStudID());
			System.out.println(stud.getStudName());
			System.out.println("Student in " + stud.instName);
		}
		
		//local variable of stud - not available
		//stud.in
		
	}
}
