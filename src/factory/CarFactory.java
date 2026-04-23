package factory;

import factory.engines.*;

public class CarFactory {

    public static Car createCar(String type) {

        switch (type.toLowerCase()) {
            case "gas":
                return new Car(new GasolineEngine());

            case "electric":
                return new Car(new ElectronicEngine());

            case "hybrid":
                return new Car(new HybridEngine());

            default:
                throw new RuntimeException("Unknown engine type");
        }
    }

    public static void replaceEngine(Car car, String type) {

        switch (type.toLowerCase()) {
            case "gas":
                car.setEngine(new GasolineEngine());
                break;

            case "electric":
                car.setEngine(new ElectronicEngine());
                break;

            case "hybrid":
                car.setEngine(new HybridEngine());
                break;

            default:
                throw new RuntimeException("Unknown engine type");
        }
    }
}