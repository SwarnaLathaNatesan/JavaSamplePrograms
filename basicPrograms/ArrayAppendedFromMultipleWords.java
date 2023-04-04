package basicPrograms;

public class ArrayAppendedFromMultipleWords {

	public static void main(String[] args) {
		String x[] = { "ab", "bc" };

		// to iterate each element
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		// to check charAt
		String s = new String("Dharani");
		s.charAt(0);

		// Design Reference
		// 1.Array elements with crude approximate #
		// that may become wrong. Hence not preferred

		// 2. Hash map

		// 3. use the current words as such for input

		// to iterate each character in element
		char outputArray[] = new char[26];
		for (int i = 0; i < x.length; i++) {
			String currentWord = (String) x[i];
			int wordLen = currentWord.length();
			for (int j = 0; j < wordLen; j++) {
				System.out.println("search for char : " + currentWord.charAt(j) + " in input array");

				boolean found = false;
				int k;
				int lastElement = 0;
				for (k=0; k < outputArray.length; k++) {
					
					if (outputArray[k] == '\0')
					{
						lastElement = k;
						break;
					}
					
					if (currentWord.charAt(j) == outputArray[k]) {
						found = true;
						break;
					}
				}
				
				//add new char in output array
				if (found == false) {
					outputArray[lastElement] = currentWord.charAt(j);
				}
				

			}

		
		
		System.out.println( "output array characters are ");
		
		for (int outIndex = 0; outIndex<outputArray.length ; outIndex++ ) {
			System.out.println( outputArray[outIndex]);
		}
		}
			

	}
}
