package basicPrograms;

public class DefaultValueInCharArray {
    public static void main(String[] args) {
        char[] myCharArray = new char[10];
        for (char c : myCharArray) {
            System.out.println("value is :" + c + ".");
            
            if (c == '\0') {
            	System.out.println("check for \\0 value is :" + c + ".");
            }
            
            if (c == '\u0000') {
            	System.out.println("check for \\u0000 value is :" + c + ".");
            }
        }
    }
}