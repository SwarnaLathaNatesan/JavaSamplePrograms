package basicPrograms;


import java.util.HashMap;
import java.util.Map;

public class AddingDuplicateValuesInHashMapWithCounter {
    public static void main(String[] args) {
        String str = "abcda";
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0, j=0; i < str.length(); i++, j++) {
            char c = str.charAt(i);
            charCount.put(c, j);
                 }

        System.out.println("Unique alphabets in the string are:");
        System.out.println(charCount.keySet());
        System.out.println(charCount);
    }
}