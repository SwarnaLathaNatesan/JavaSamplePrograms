package basicPrograms;



/*
 * LL : 	static methods can get called without object creation
 * LL : static variables are called class variables
 * 
 */
class SmartPhone {

	private int unlockPin;

	//LL function or method definition
	public void unlock(int x) {
		System.out.println("Phone unlock attempted using Pin");	
		if (x == unlockPin)
			unlockPhone();
		else
			System.out.println("wrong pin!!! Retry");
	}

	public void unlock(int x, int y) {
		System.out.println("Phone unlock attempted using Pin. Number of attempt is counted");
		
		//TODO: Check # of attempts. if it is more than maxNoofAttempts, 
		//return a message saying that user can try after a minute
		
		if (x == unlockPin)
			unlockPhone();
		else
			System.out.println("wrong pin!!! Retry");
	}
	public void unlock(String password) {
		System.out.println("Phone unlock attempted using password");
		if (password.equals("xxx"))
			unlockPhone();
		else
			System.out.println("wrong password!!! Retry");
	}

	public void unlockPhone() {
		System.out.println("Phone unlocked");
	}

	public void setUnlockPin(int unlockPin) {
		this.unlockPin = unlockPin;
	}

}

public class OverLoadingDemo {

	public static void main(String s[]) {

		SmartPhone mobile = new SmartPhone();
		mobile.setUnlockPin(100);
		mobile.unlock(100);
		mobile.unlock("xxx");

	}

}
