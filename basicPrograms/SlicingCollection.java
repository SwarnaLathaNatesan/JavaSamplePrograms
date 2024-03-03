package basicPrograms;
//Pseudocode
/*
 * Input CollectionLength
Input SliceAt


For (int I = 0; i<=sliceAt; i++)
add I in firstSlice

For (int i=sliceAt; i<=CollectionLength; i++)
add I in secondSlice

 */

	import java.util.ArrayList;

	public class SlicingCollection {
	    public static void main(String[] args) {
	        // Input variables
	        int collectionLength = 10; // Example collection length
	        int sliceAt = 3; // Example slice index

	        // Initialize two ArrayLists to represent the first and second slices
	        ArrayList<Integer> firstSlice = new ArrayList<>();
	        ArrayList<Integer> secondSlice = new ArrayList<>();

	        // Populate the slices based on the rotation logic
	        for (int i = 0; i <= sliceAt; i++) {
	            firstSlice.add(i);
	        }

	        for (int i = sliceAt + 1; i < collectionLength; i++) {
	            secondSlice.add(i);
	        }

	        // Display the contents of the slices
	        System.out.println("First Slice: " + firstSlice);
	        System.out.println("Second Slice: " + secondSlice);
	    }
	}
