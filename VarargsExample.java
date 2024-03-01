package samplePrograms;

public class VarargsExample {
    public static void main(String[] args) {
        // Calling the method with different number of arguments
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50, 66, 77);
        printNumbers(); // You can also call with zero arguments
    }

    // Method with variable-length arguments
    public static void printNumbers(int... numbers) {
        System.out.println("Printing numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
