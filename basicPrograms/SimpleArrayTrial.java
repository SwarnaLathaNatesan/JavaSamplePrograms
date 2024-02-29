package basicPrograms;


import java.util.HashMap;
import java.util.Map;

public class SimpleArrayTrial {
    public static void main(String[] args) {

    	
    	
    	int[] studentID = new int[62];
    	
        for (int i = 0 ; i < 62 ; i++) {
         
            studentID[i] = i+1;
            
                   }
        
        
        for (int i = 0 ; i < 62 ; i++) {
            System.out.println( "RollNo " + (i+1) + " i value is " + studentID[i]);

            
                   }
     
    }
}