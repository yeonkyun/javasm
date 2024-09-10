package interfaces;

public class AirConditioner implements Remote {
    @Override
    public void turnOn() {
        System.out.println("AirConditioner is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner is turned off");
    }
}
