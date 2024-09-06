package inherit2;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircum() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.getX() + ", " + super.getY() + ", " + radius;
    }
}
