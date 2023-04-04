package basicPrograms;

public class PassByValuesInObjectDemo {
	public static void main(String[] args) {
		// Create a new object of type Person and assign it to a variable
		Person alice = new Person("Alice", 25);
		// Print the details of the alice object to see if it was modified
		System.out.println("Initial Values ");
		System.out.println("Name: " + alice.getName()); // Output: Alice
		System.out.println("Age: " + alice.getAge()); // Output: 25

		// Call the modifyPerson method and pass the alice object reference
		modifyPerson(alice);

		// Print the details of the alice object to see if it was modified
		System.out.println("Processing Method Call ");
		System.out.println("Name: " + alice.getName()); // Output: Alice
		System.out.println("Age: " + alice.getAge()); // Output: 25
	}

	public static void modifyPerson(Person person) {
		// Modify the name and age of the person object
		person.setName("Bob");
		person.setAge(30);
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

/*
 * 
 *
 * This output confirms that the alice object was modified by the modifyPerson
 * method, even though we passed the alice object reference to the method. This
 * is because the modifyPerson method modified the state of the Person object
 * that the alice reference points to.
 * 
 * When we pass the alice object reference to the modifyPerson method, a copy of
 * the object refererence variable is created and passed to the method. The method can then use
 * the reference to access and modify the Person object's state, and these
 * modifications affect the Person object itself.
 * 
 * In this case, the modifyPerson method modifies the name to "Bob" and the age
 * to 30, and these modifications affect the original alice reference. When we
 * print the name and age of the alice object after the method call, we see that
 * the output shows "Name: Bob" and "Age: 30".
 */
