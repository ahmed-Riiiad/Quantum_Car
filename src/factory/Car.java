package factory;

import factory.engines.Engine;

public class Car {

    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.setSpeed(0);
        System.out.println("Car started with " + engine.getName());
    }

    public void stop() {
        if (speed != 0) {
            System.out.println("You must stop car first!");
            return;
        }
        engine.setSpeed(0);
        System.out.println("Car stopped");
    }

    public void accelerate() {
        if (speed + 20 <= 200)
            speed += 20;

        sync();
        System.out.println("Speed: " + speed);
    }

    public void brake() {
        speed = Math.max(0, speed - 20);
        sync();
        System.out.println("Speed: " + speed);
    }

    private void sync() {
        engine.setSpeed(speed);
    }

    public void replaceEngine(Engine newEngine) {
        this.engine = newEngine;
        engine.setSpeed(speed);
        System.out.println("Engine changed to " + engine.getName());
    }
}