package ToUnderstandConstructor;

public class Student {
	String studName ;
	public Student(String lstudName){
		studName = lstudName;
	}
	public void displayStudentName() {
	 System.out.println(studName);
	}
	
	public String getStudentName() {
		  return studName;
		}
	public static void main(String[] args) {
		Student stud1 = new Student("kavi");
		String studentName = stud1.getStudentName();
		System.out.println(studentName);
	}
}
