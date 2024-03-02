package samplePrograms.outsidePackage.AccessSpecifierDemo;

import samplePrograms.AccessSpecifierDemo.Student;

public class Faculty {

		private int facultyID ;

		public int getFacultyID() {
			return facultyID;
		}

		public void setFacultyID(int facultyID) {
			this.facultyID = facultyID;
		}
		
		public static void main(String[] args) {
			Faculty faculty = new Faculty();
			Student stud1 = new Student();
			System.out.println(stud1.packageLevel);
			stud1.setStudID(106);
			//if private it cannot be accessed
			//System.out.println(stud1.studID);
			
			//System.out.println(stud1.x);
		}

}
