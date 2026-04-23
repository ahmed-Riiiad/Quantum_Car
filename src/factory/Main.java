package factory;

public class Main {

    public static void main(String[] args) {

        Car car = CarFactory.createCar("hybrid");

        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();

        car.brake();

        car.stop();
    }
}