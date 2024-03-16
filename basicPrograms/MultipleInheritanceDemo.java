// Define an interface for Electric cars
package samplePrograms.inheritance;
//Define an interface for Electric cars
interface ElectricCar {
 default void fuel() {
     System.out.println("Electricity");
 }
}

//Define an interface for Diesel cars
interface DieselCar {
 default void fuel() {
     System.out.println("Diesel");
 }
}

//Create a HybridCar class that implements both interfaces
class HybridCar implements ElectricCar, DieselCar {
 // Since both interfaces have a default fuel() method,
 // we must provide an implementation in the HybridCar class
 @Override
 public void fuel() {
     System.out.println("Hybrid (Electric + Diesel)");
     
     // To call the ElectricCar's fuel() method explicitly, you can do:
     ElectricCar.super.fuel(); // This calls the ElectricCar's fuel() method.
     DieselCar.super.fuel();
 }
}

public class MultipleInheritanceDemo {
 public static void main(String[] args) {
     HybridCar myCar = new HybridCar();
     
     // Call the fuel() method of the HybridCar class
     myCar.fuel(); // This will print "Hybrid (Electric + Diesel)" followed by "Electricity"
 }
}
