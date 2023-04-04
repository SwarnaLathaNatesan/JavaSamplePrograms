package basicPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        char[] myCharArray = {'a','b','c'};
        
        Iterator<char[]> iterator = Arrays.asList(myCharArray).iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}