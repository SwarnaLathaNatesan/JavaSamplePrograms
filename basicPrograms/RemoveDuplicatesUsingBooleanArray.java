package basicPrograms;

public class RemoveDuplicatesUsingBooleanArray {
	public static void main(String[] args) {
		String str = "hello world";
		String result = removeDuplicates(str);
		System.out.println(result); // prints "helo wrd"
	}

	public static String removeDuplicates(String str) {
		// convert the string to a character array
		char[] chars = str.toCharArray();

		// create a boolean array to keep track of which characters have already
		// appeared
		boolean[] seen = new boolean[256]; // assuming ASCII character set

		// create a StringBuilder to build the result string
		StringBuilder sb = new StringBuilder();

		// iterate over each character in the array
		for (char c : chars) {
			// if the character has not already appeared, add it to the StringBuilder and
			// mark it as seen
			if (!seen[c]) {
				sb.append(c);
				seen[c] = true;
			}
		}

		// convert the StringBuilder to a string and return it
		return sb.toString();
	}
}