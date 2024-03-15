package polymorphism;

class Mobile {
	protected int cost;
	protected int additionalFeatureCost;
	private String colour;
	private int unlockPin;
	private String operatingSys;

	Mobile() {
		System.out.println("Base class constructor called");
		cost = 1000;
	}

	// Constructor overloading
	Mobile(int cost, String colour, String operatingSys) {
		this.cost = cost;
		this.colour = colour;
		this.operatingSys = operatingSys;
	}

	public int getCost() {
		return cost;

	}

	public String getColour() {
		return colour;
	}

	public String getOperatingSys() {
		return operatingSys;
	}

	public void setCost() {
		System.out.println("In base class Mobile : CostSetting");
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

}

class Samsung extends Mobile {
	private int costOfAdditionalFeature1 = 3000;
	private int costOfAdditionalFeature2 = 1000;

//LL - first method to get called when object gets created
	Samsung() {
		System.out.println("Derived class constructor called");
		// setCost();
	}

	public void setCost() {
		System.out.println("Set Cost of Derived Class : Samsung");
		additionalFeatureCost = costOfAdditionalFeature1 + costOfAdditionalFeature2;
		super.setCost();

		// what happens if u replace above statement
		// setCost();
		// super.setCost();
	}

	
	public void uniqueFeatureOfSamsung() {
		System.out.println("all unique features of samsung ");
	}
}

class Nokia extends Mobile {
	int costOfAdditionalFeature1 = 1000;
	int costOfAdditionalFeature2 = 1000;

	Nokia() {

	}

	public void setCost() {
		System.out.println("Overriding feature of Nokia Mobile base class ");
		additionalFeatureCost = costOfAdditionalFeature1 + costOfAdditionalFeature2;
		super.setCost();

		// what happens if u replace above statement
		// setCost();
		// super.setCost();
	}

}

class Ipad {
	private boolean sim = false;

	public void getSim() {
		System.out.println("sim status " + sim);
	}
}

public class PolymorphismTrial {
	public static void Main() {
		System.out.println("Test");
	}
	public static void main(String s[]) {
		// LL - object reference variable
		// variable that refers to object created
		// also an object

		// Baseclass object reference variable - mobile
		Mobile mobile;
		 mobile = new Mobile();
		//mobile = new Mobile(6000, "PINK", "Android");
		mobile.setCost();
		mobile.getCost();

		System.out.println("Cost of " + mobile.getClass() + "  is " + mobile.getCost());
		System.out.println("Colour of the mobile : " + mobile.getColour());
		System.out.println("Operating System : " + mobile.getOperatingSys());

		// points out to created object of derived class
		mobile = new Samsung();

		// method invocation using object reference variable now will invoke derived
		// class/object's method
		mobile.setCost();
		// the above is called method over riding or runtime polymorphism

		mobile.getCost();
		System.out.println("Cost of " + mobile.getClass() + " is " + mobile.getCost());

		((polymorphism.Samsung)mobile).uniqueFeatureOfSamsung();
		
		mobile = new Nokia();

		// method invocation using object reference variable now will invoke derived
		// class/object's method
		mobile.setCost();
		// the above is called method over riding or runtime polymorphism

		mobile.getCost();
		System.out.println("Cost of " + mobile.getClass() + " is " + mobile.getCost());

	}

}