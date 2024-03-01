package ToUnderstandConstructorAndStatic;

public class Student {
	String studName ;
	static int numberOfStudents;
	
	public Student(String lstudName){
		studName = lstudName;
		numberOfStudents++;
	}
	public void displayStudentName() {
	 System.out.println(studName);
	}
	
	public String getStudentName() {
		  return studName;
		}
	public static int getTotalNumberOfStudents() {
		return numberOfStudents;
	}
	
	public static void main(String[] args) {
		Student stud1 = new Student("kavi");
		String studentName = stud1.getStudentName();
		System.out.println(studentName);
		
		Student stud2 = new Student("Reetu");
		System.out.println(stud1.getStudentName());
		
		System.out.println("Total number of students " + Student.getTotalNumberOfStudents());
	}
}
