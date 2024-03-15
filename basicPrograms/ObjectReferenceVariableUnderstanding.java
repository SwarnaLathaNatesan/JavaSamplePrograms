package pointerConcept;
import pojo.*;

//pushtogit15thmar
public class ObjectReferenceVariableUnderstanding {
public static void main(String[] args) {
	Student stud1 = new Student();
	stud1.setStudID(17);
	stud1.setStudName("arjun");
	
	Student stud2 = new Student();
	stud2.setStudID(18);
	stud2.setStudName("swarna");
	
	System.out.println("Printing students data before calling");
	System.out.println(stud1.getStudName());
	System.out.println(stud2.getStudName());
	
	setTitle(stud1);
	setTitle(stud2);
	System.out.println("Printing students data");
	System.out.println(stud1.getStudName());
	System.out.println(stud2.getStudName());
}
public static void setTitle(Student s1) {
	s1.setStudName("Mr./Miss/Mrs. " + s1.getStudName());
}

}
