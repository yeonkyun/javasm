package oop2;

import java.util.Random;

public class Car {
    private int serial;
    private String name;
    private String color;
    private double fuelSize;
    private double currentFuel;

    public Car() {
        Random random = new Random();
        this.serial = random.nextInt(10000) + 1;
    }



    public Car(String name, String color, double fuelSize, double currentFuel, int serial) {
        this.serial = serial;
        this.color = color;
        this.currentFuel = currentFuel;
        this.fuelSize = fuelSize;
        this.name = name;
    }

    public Car(String name, String color, double fuelSize, double currentFuel) {
        this();
        this.color = color;
        this.currentFuel = currentFuel;
        this.fuelSize = fuelSize;
        this.name = name;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public void addFuel(double size) throws Exception{
        if (this.currentFuel + size > this.fuelSize) {
            throw new Exception("EC0001");
        }
    }

    public void go(int distance) {
        // 1L -> 100km
        double fuelNeeded = distance / 100.0;
        if (fuelNeeded > this.currentFuel) {
            System.out.println("Not enough fuel");
            return;
        }
        System.out.printf("%s is going %d km\n", this.name, distance);
    }

    public void stop() {
        System.out.printf("%s is stopping\n", this.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", serial=" + serial +
                ", name='" + name + '\'' +
                ", fuelSize=" + fuelSize +
                ", currentFuel=" + currentFuel +
                '}';
    }
}