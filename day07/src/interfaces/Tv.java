package interfaces;

public class Tv implements Remote, Bluetooth {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }


    @Override
    public void pairing() {
        System.out.println("Pairing with TV");
    }

    @Override
    public void unpairing() {
        System.out.println("Unpairing with TV");
    }
}
