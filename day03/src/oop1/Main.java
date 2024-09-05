package oop1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("White", "Ford", 1234);
        System.out.println(car);

        car.go();
        car.stop();
    }
}
