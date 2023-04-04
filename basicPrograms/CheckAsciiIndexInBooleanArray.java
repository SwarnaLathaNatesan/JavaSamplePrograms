package basicPrograms;

public class CheckAsciiIndexInBooleanArray {
public static void main(String[] args) {
	boolean b[] = new boolean[256];
	
	b[0] = true;
	b['A'] = true;
	
	System.out.println(b[0]);
	System.out.println(b[65]);
	System.out.println(b[66]);
	
	for (int i=0; i<256;i++) {
		System.out.println(i + " " + b[i] );
	}
}
}
