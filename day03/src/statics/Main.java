package statics;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red");
        System.out.println(car);
        Car car2 = new Car("Toyota", "Blue");
        System.out.println(car2);
        Car car3 = new Car("Toyota", "Green");
        System.out.println(car3);

        System.out.println(car.vendor);

        System.out.println(Math.PI);
        System.out.println(Math.max(10, 3));
    }
}
