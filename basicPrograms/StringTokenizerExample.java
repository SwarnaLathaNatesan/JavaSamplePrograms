package samplePrograms;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("split my message as tokens ");
		String delim = " ";
		
		StringTokenizer st = new StringTokenizer(str.toString(), delim);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		str = new StringBuilder(" line 2 to test tokens ");
		 st = new StringTokenizer(str.toString(), delim);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
