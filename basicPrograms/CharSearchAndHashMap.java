package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharSearchAndHashMap {
    public static void main(String[] args) {
        String str = "Heo!";
        char searchChar = 'l';

        Map<Character,Integer> charCount = new HashMap<>();

        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
                if (charCount.containsKey(c)) {
                   found = true;
                } 
            }
        if (found == false)
        	 charCount.put(searchChar,1);
        

    System.out.println("Occurrences of '" + searchChar + "' in the string:");
    System.out.println(charCount);
}
    }
