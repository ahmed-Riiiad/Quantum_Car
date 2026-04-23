package factory.engines;

public class GasolineEngine implements Engine {

    private int speed = 0;

    public void increase() { speed++; }

    public void decrease() {
        if (speed > 0) speed--;
    }

    public void setSpeed(int speed) { this.speed = speed; }

    public int getSpeed() { return speed; }

    public String getName() { return "GasolineEngine"; }
}