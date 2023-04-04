package basicPrograms;

import java.util.Scanner;

public class Student {
//object variables or instance data member or instance variables
	private String studName;

	private int studID;
	
	public static final String instituteName = "BBT";
	
	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = "" ;
		
		System.out.println("in method of setStudName");
	}


}
