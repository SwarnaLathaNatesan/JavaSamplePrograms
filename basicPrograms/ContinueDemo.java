package basicPrograms;

class ContinueDemo {
	public static void main(String s[]) {

		for (int i = 0; i < 5; i++) {

			System.out.println(" within loop for iteration : " + (i));
			System.out.println(" in first statement of printing ");
			System.out.println(" in second statement of printing ");

			if (i % 2 == 0) {
				System.out.print("Remainder  is 0 when i is ");
				System.out.println(i);
			}
			// continue;

			System.out.println(" in third statement of printing - expected for oddnumbers ");

		}

	}
}
