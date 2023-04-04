package basicPrograms;

import java.util.Arrays;

public class PassByValueUsingStringArray {
    public static void main(String[] args) {
        String[] words = { "Ridh", "Krith", "Kav" };
        System.out.println("Before calling method: " + Arrays.toString(words));
        modifyArray(words);
        System.out.println("After calling method: " + Arrays.toString(words));
    }

    public static void modifyArray(String[] arr) {
        arr[0] = arr[0] + "i";
        arr[1] = arr[1] + "i";
        arr[2] = arr[2] + "i";
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}