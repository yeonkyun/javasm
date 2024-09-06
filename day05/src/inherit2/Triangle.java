package inherit2;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public double getCircum() {
        return this.base + this.height + Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
    }

    @Override
    public String toString() {
        return "Triangle: " + super.getX() + ", " + super.getY() + ", " + base + ", " + height;
    }
}
