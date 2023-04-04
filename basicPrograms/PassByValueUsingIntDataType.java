package basicPrograms;
public class PassByValueUsingIntDataType {
    public static void main(String[] args) {
        int num = 30;
        System.out.println("Before calling method: " + num);
        num = modifyInt(num);
        System.out.println("After calling method: " + num);
    }
    
    public static int modifyInt(int n) {
        n = n + 5;
        System.out.println("Modified int: " + n);
        return n;
    }
}