package basicPrograms;

class Phone{
	void setOs() {
		System.out.println("java OS .. from Phone");
	}
}

class SamsungPhone extends Phone{
	void setOs() {
		super.setOs();
		System.out.println("Android OS... from samsungphone");
	
	
	}	
}

class SamsungNotesPhone extends SamsungPhone{
	void setOs() {
		super.setOs();
		System.out.println("Android OS from notes");
	}	
}


public class InheritanceDemoWithOneMethodOverRiding{
	public static void main(String[] args) {
		Phone p1 = new SamsungNotesPhone();
		p1.setOs();
	}
}