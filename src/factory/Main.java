package factory;

public class Main {
    public static void main(String[] args) {

        //Gas Car 
        Car gasCar = CarFactory.createCar("gas");
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();


        // Electric Car 
        Car electricCar = CarFactory.createCar("electric");
        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.stop();


        // Hybrid Car 
        Car hybridCar = CarFactory.createCar("hybrid");
        hybridCar.start();
        hybridCar.accelerate(); 
        hybridCar.accelerate();
        hybridCar.accelerate(); 
        hybridCar.accelerate(); 
        hybridCar.brake();     
        hybridCar.brake();      
        hybridCar.stop();


        // Replace Engine Test 
        Car car = CarFactory.createCar("electric");
        car.start();
        car.accelerate();
        CarFactory.replaceEngine(car, "hybrid");
        car.accelerate();
        car.accelerate();
        car.stop();
    }
}