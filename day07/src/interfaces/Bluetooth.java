package interfaces;

public interface Bluetooth {
    void pairing();
    void unpairing();

    default void on() {
        System.out.println("Bluetooth is turned on");
    }
}
