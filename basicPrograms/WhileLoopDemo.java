package basicPrograms;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int i = 101;

		// initialization
		// condition / upper range setting/upper bound setting
		// incrementation or decrementation
		while (i <= 100) {
			System.out.println("value of i is while..." + i);
			i = i + 10;
		}

		i = 101;
		do {
			System.out.println("value of i is do.. while" + i);
			i = i + 10;

		} while (i <= 100);
	}
}
