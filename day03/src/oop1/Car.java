package oop1;

public class Car {
    int serial;
    String name;
    String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String color, String name, int serial) {
        this.color = color;
        this.name = name;
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void go() {
        System.out.println("Car Go!");
    }

    public void stop() {
        System.out.println("Car break!");
    }
}
