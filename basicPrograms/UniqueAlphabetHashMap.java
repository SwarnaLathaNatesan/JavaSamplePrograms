package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueAlphabetHashMap {
    public static void main(String[] args) {
        String str = "Hello, World, ab, cd , de, dharani!";
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
          
            if (Character.isLetter(c)) {
                charCount.put(c, 1);
            }
        }

        System.out.println("Unique alphabets in the string:");
        System.out.println(charCount.keySet());
    }
}