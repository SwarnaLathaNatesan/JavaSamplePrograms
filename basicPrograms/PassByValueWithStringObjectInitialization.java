package basicPrograms;


public class PassByValueWithStringObjectInitialization {
    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println("Before calling method: " + str);
        modifyString(str);
        System.out.println("After calling method: " + str);
    }
    
    public static void modifyString(String s) {
        s = s + " World";
        System.out.println("Modified string: " + s);
    }
}
