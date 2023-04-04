package basicPrograms;

public class AsciiAndAlphabetDemo {
	public static void main(String[] args) {
		char c = 65;
	
		char carray[] = new char[26];

		for (int i = 65, j = 0; j < 26; i++, j++) {
			carray[j] = (char) i;
		}

		for (int j = 0; j < 26; j++) {
			System.out.println(carray[j]);
		}
	}
}
