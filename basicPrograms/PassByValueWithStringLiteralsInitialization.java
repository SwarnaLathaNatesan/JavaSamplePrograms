package basicPrograms;

/*
 * Yes, the program will use the String pool and heap memory in Java.

In this program, a String variable str is initialized with a String literal "Hello". String literals are usually stored in the String pool, a section of the heap memory where Java stores String objects to increase performance and memory efficiency.

When the modifyString method is called with the str variable passed as an argument, a new String object is created by concatenating the original String object "Hello" with " World". This new String object is stored in the heap memory.

However, the s variable inside the modifyString method is a local variable that points to the same String object as str. When the s variable is updated by concatenating " World" to it, a new String object is created and assigned to s, but the original String object "Hello" referenced by str remains unchanged.

Therefore, after the modifyString method returns, the str variable still points to the original String object "Hello". The program outputs "Before calling method: Hello" and "After calling method: Hello", confirming that the original String object was not modified.

So, the program uses both String pool and heap memory to store and manipulate String objects, 
 */

public class PassByValueWithStringLiteralsInitialization {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Before calling method: " + str);
        modifyString(str);
        System.out.println("After calling method: " + str);
    }
    
    public static void modifyString(String s) {
        s = s + " World";
        System.out.println("Modified string: " + s);
    }
}
