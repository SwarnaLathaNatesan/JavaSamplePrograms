package basicPrograms;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		OuterClass2 outerObj = new OuterClass2();
		System.out.println("Access through outer class Method ");
		outerObj.outerMethod();
		
		
		System.out.println("Instantiation through outer class ");
		OuterClass2.InnerClass innerObj = outerObj.new InnerClass();	
		innerObj.innerMethod();
	}
	
}

class OuterClass2 {
	  private int outerVariable = 10;

	  public void outerMethod() {
	    InnerClass innerObj = new InnerClass();
	    innerObj.innerMethod();
	  }

	  public class InnerClass {
	    public void innerMethod() {
	      System.out.println("Inner class method called!");
	      System.out.println("Outer variable value: " + outerVariable);
	    }
	  }
	}
