package oop2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("K1", "Red", 50, 10);

        try {
            car1.addFuel(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(car1);
        car1.go(1000);
        car1.stop();
    }
}
