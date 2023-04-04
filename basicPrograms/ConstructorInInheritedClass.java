package basicPrograms;



class base {
	int x;

	base() {
		System.out.println("Inside base constructor");
	}

	base(int x) {
		System.out.println("Inside base constructor overloaded");
	}
	void m1() {

	}
}

class c2 extends base {
	int y;

	c2() {
		super(3);
		System.out.println("Inside c2 constructor");
	}

	void m2() {

	}
}

class c3 extends c2 {
	int z;

	c3() {
		
		System.out.println("Inside c3 constructor");
	
	}

	void m3() {

	}
}

public class ConstructorInInheritedClass {
	public static void main(String[] args) {
		c3 obj = new c3();
System.out.println(Double.MIN_VALUE);
	}

}