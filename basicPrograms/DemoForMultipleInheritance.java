package basicPrograms;

interface Vehicle {
    void start();
    void stop();
}

interface Engine {
    void accelerate();
    void brake();
}

class Car implements Vehicle, Engine {
    public void start() {
        // Implementation for starting the car
    }
    
    public void stop() {
        // Implementation for stopping the car
    }
    
    public void accelerate() {
        // Implementation for accelerating the car
    }
    
    public void brake() {
        // Implementation for braking the car
    }
}


/*
 * In this example, the Car class implements both the Vehicle and Engine
 * interfaces, which define the behaviors it needs to inherit. This allows the
 * Car class to have the behavior of both a vehicle and an engine without the
 * issues that can arise from multiple inheritance.
 * 
 * So, while Java does not support multiple inheritance, it does provide a form
 * of hybrid inheritance through the use of interfaces.
 * 
 * 
 */


