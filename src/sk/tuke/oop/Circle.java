package sk.tuke.oop;

public class Circle extends Shape {
    private int x;

    private int y;

    private int radius;

    public Circle(int x, int y, int radius) {
        super(Color.RED);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int x, int y, int radius, Color color) {
        this(x, y, radius);
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle [" + x + ", " + y + "] with radius "
                + radius + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;    //x = x + deltaX;
        y += deltaY;    //y = y + deltaY;
    }

    @Override
    public void resize(double factor) {
        radius = (int) (radius * factor);
    }

    @Override
    public String toString() {
        return "Circle [" + x + ", " + y + "] with radius "
                + radius + " and color " + getColor();
    }
}
