package basicPrograms;

import java.util.Arrays;

public class PassByValueUsingIntegerArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println("Before calling method: " + Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After calling method: " + Arrays.toString(arr));
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}