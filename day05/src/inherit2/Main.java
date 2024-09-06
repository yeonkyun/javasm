package inherit2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, 2, 3);
        shapes[1] = new Rectangle(4, 5, 6, 7);
        shapes[2] = new Triangle(8, 9, 10, 11);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Circumference: " + shape.getCircum());
            System.out.println();
        }
    }
}
