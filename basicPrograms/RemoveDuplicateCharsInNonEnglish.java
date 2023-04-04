package basicPrograms;
import java.util.*;
import java.io.*;

public class RemoveDuplicateCharsInNonEnglish {
    public static void main(String[] args) throws Exception {
        // Read input Tamil word from user using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Tamil word:");
        String word = scanner.nextLine();
        
        // Convert the word to an array of Unicode code points
        int[] codePoints = word.codePoints().toArray();
        System.out.println("len of word " + codePoints.length);
        // Create a HashSet to store unique Unicode code points
        Set<Integer> uniqueCodePoints = new HashSet<>();
        
        // Loop through the code points and add unique code points to the set
        for (int codePoint : codePoints) {
            uniqueCodePoints.add(codePoint);
            System.out.println(codePoint);
        }
        
        // Create a StringBuilder to store the final word
        StringBuilder sb = new StringBuilder();
        
        // Loop through the set and append the unique code points to the StringBuilder
        for (int codePoint : uniqueCodePoints) {
            sb.appendCodePoint(codePoint);
        }
        
        // Print the final word without duplicate characters
        System.out.println("Word without duplicate characters: " + sb.toString());
        
        // Close the scanner
        scanner.close();
    }
}
