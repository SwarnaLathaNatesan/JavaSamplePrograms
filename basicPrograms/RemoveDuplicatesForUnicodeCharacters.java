package basicPrograms;

import java.util.*;

public class RemoveDuplicatesForUnicodeCharacters {
    public static void main(String[] args) {
        String str = "héllo wörld";

        String result = removeDuplicates(str);
        System.out.println(result); // prints "hélo wrd"
    }
    
    public static String removeDuplicates(String str) {
        // convert the string to a character array
        char[] chars = str.toCharArray();
        
        // create a HashSet to keep track of which characters have already appeared
        Set<Character> seen = new HashSet<>();
        
        // create a StringBuilder to build the result string
        StringBuilder sb = new StringBuilder();
        
        // iterate over each character in the array
        for (char c : chars) {
            // if the character has not already appeared, add it to the StringBuilder and mark it as seen
        	
        	System.out.println("condition check for " + c + " : " + seen.contains(c));
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        
        // convert the StringBuilder to a string and return it
        return sb.toString();
    }
}