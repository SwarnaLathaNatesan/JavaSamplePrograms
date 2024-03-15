package samplePrograms;





//pushtogit15thmar
 abstract class Car {

	protected float baseModelCost = 0.0f;
	protected String chasisNumber ="";
	protected float gstPercentage ;

	Car(){
		System.out.println("Constructor method of a car to set the gstpercentage");
		gstPercentage = 0.18f;
	}
	
	abstract public float getCost() ;
		
	
	abstract public void runEngine() ;
	
	public float getTax() {
		return gstPercentage;
	}
	abstract public void setChasisNumber(String chasisNumber) ;
	
	abstract public String getChasisNumber() ;
}



	

class Ford extends Car {
	Ford(String chasisNumber) {
		this.chasisNumber = "F" + chasisNumber;
		baseModelCost = 1000000.00f;
	}
	public float getCost() {
		float additionalFeatureCost = 250000.50f;
		return baseModelCost + additionalFeatureCost;
	}
	
	public void runEngine() {
		System.out.println("I am ford and staring my own designed engine");
	}

	 public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber; 
	}
	public String getChasisNumber() {
		return chasisNumber; 
	}
	
}

class Honda extends Car {

	Honda(String chasisNumber) {
		super();
		this.chasisNumber = "H" + chasisNumber;
		baseModelCost = 800000.00f;
	}

	public float getCost() {
		float additionalFeatureCost = 400000.50f;
		return baseModelCost + additionalFeatureCost;
	}
	
	//TODO
	//Find the cost with tax
	
	
	public void runEngine() {
		System.out.println("Hey, I am Honda and staring my own designed engine");
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber; 
	}
	public String getChasisNumber() {
		return chasisNumber; 
	}
}



public class AbstractDemo {
	public static void main(String s[]) {

		//Car car = new Car();
		// PointToLearn
		// gives compilation error - you cannot create object for the abstract class
		// as you have not defined all the functionalities in it


	
		Honda honda = new Honda("787899");
		System.out.println("Chasis Number for my car is " + honda.getChasisNumber());
		System.out.println("Basemodelcost is INR " + honda.getCost());
		System.out.println("Tax percentage is " + honda.getTax());
		honda.runEngine();

		Ford fordCar = new Ford("686899");
		System.out.println("Chasis Number for my car is " + fordCar.getChasisNumber());
		System.out.println("Basemodelcost is INR " + fordCar.getCost());
		fordCar.runEngine();

	}
}

