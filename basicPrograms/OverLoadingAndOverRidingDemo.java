package basicPrograms;

class Mobile {
	protected int cost;
	protected int additionalFeatureCost;

	private int unlockPin;

	private boolean sim = false;
	public boolean s = true;
	
	
	Mobile() {
		System.out.println("Base class constructor called");
		cost = 5000;
	}


	public void getSim() {
		System.out.println("sim status " + sim);
	}

	// Constructor overloading
	Mobile(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;

	}

	public void setCost() {
		cost = cost + additionalFeatureCost;
	}

	public void unlock(int x) {
		if (x == unlockPin)
			unlockPhone();
		else
			System.out.println("wrong pin!!! Retry");
	}

	public void unlock(String password) {
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

	public void certify() {

		System.out.println("Certifying Base Phone features by common Government Board ");
	}

}

class Samsung extends Mobile {
	private int costOfAdditionalFeature1 = 3000;
	private int costOfAdditionalFeature2 = 1000;

//LL - first method to get called when object gets created
	Samsung() {
		System.out.println("Derived class constructor called");
		// setCost();
	}

	public void SetCost() {
		additionalFeatureCost = costOfAdditionalFeature1 + costOfAdditionalFeature2;
		cost = cost + additionalFeatureCost;

		// what happens if u replace above statement
		// setCost();
		// super.setCost();
	}

	public void getUniqueFeatureOfSamsung() {
		System.out.println("IN getUniqueFeatureOfSamsung ");
	}

	public void certify() {

		super.certify();
		System.out.println("Certifying samsung features ");
	}

}

class Nokia extends Mobile {
	int costOfAdditionalFeature1 = 1000;
	int costOfAdditionalFeature2 = 1000;

	Nokia() {

	}

	public void setCost() {
		additionalFeatureCost = costOfAdditionalFeature1 + costOfAdditionalFeature2;
		cost = cost + additionalFeatureCost;
	}

}

class Ipad extends Mobile {
	public void getUniqueFeatureOfIpad() {
		System.out.println("IN getUniqueFeatureOfIpad ");
	}

}

public class OverLoadingAndOverRidingDemo {
	public static void main(String s[]) {

		OverLoadingOverRidingDemo();
		// TypeCastingDemo();
		// SuperDemo();
	}

	public static void SuperDemo() {
		Mobile mobile = new Samsung();
		mobile.certify();
	}

	public static void TypeCastingDemo() {
		Mobile mobile = new Samsung();
		((Samsung) mobile).getUniqueFeatureOfSamsung();

		// TODO how to get ipad Unique Feature
		// Q1
	}

	public static void OverLoadingOverRidingDemo() {
		// LL - object reference variable
		// variable that refers to object created
		// also an object

		// Baseclass object reference variable - mobile
		Mobile mobile;
		// mobile = new Mobile();
		mobile = new Mobile(6000);
		mobile.setCost();
		mobile.getCost();

		System.out.println("Cost of " + mobile.getClass() + "  is " + mobile.getCost());

		// points out to created object of derived class
		mobile = new Samsung();

		// method invocation using object reference variable now will invoke derived
		// class/object's method
		Samsung mysamsungphone = new Samsung();
		//mysamsungphone.setCost(100000);
	((Samsung)mobile).SetCost();
	((Samsung)mobile).getUniqueFeatureOfSamsung();
		// the above is called method over riding or runtime polymorphism

		mobile.getCost();
		System.out.println("Cost of " + mobile.getClass() + " is " + mobile.getCost());

		mobile = new Nokia();

		mobile.setCost();
		// the above is called method over riding or runtime polymorphism

		mobile.getCost();
		System.out.println("Cost is of " + mobile.getClass() + " is " + mobile.getCost());

		// mobile.setUnlockPin(100);
		// mobile.unlock(1000);
		// mobile.unlock("xxx");

	}

}

//Answer for Q1
/*
 * mobile = new Ipad(); ((Ipad) mobile).getUniqueFeatureOfIpad();
 */