package factory.engines;

public class MixedHybridEngine implements Engine {

    private ElectronicEngine electric = new ElectronicEngine();
    private GasolineEngine gas = new GasolineEngine();

    private int speed = 0;

    public void increase() {
        if (speed < 50) electric.increase();
        else gas.increase();

        speed++;
    }

    public void decrease() {
        if (speed < 50) electric.decrease();
        else gas.decrease();

        if (speed > 0) speed--;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

        electric.setSpeed(Math.min(speed, 50));
        gas.setSpeed(speed > 50 ? speed - 50 : 0);
    }

    public int getSpeed() { return speed; }

    public String getName() { return "HybridEngine"; }
}