package inherit2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getCircum() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.getX() + ", " + super.getY() + ", " + width + ", " + height;
    }
}
