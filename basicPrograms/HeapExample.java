package basicPrograms;

public class HeapExample {
	   public static void main(String[] args) {
	      // create an object of the Person class
	      Person1 person = new Person1("John", 30);
	      // use the object's methods
	      person.sayHello();
	      person.growOlder();
	      person.sayAge();
	   }
	}

	class Person1 {
	   private String name;
	   private int age;

	   public Person1(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }

	   public void sayHello() {
	      System.out.println("Hello, my name is " + name);
	   }

	   public void sayAge() {
	      System.out.println("I am " + age + " years old");
	   }

	   public void growOlder() {
	      age++;
	   }
	}
