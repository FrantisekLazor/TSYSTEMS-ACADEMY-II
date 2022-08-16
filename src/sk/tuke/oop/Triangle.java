package sk.tuke.oop;

public class Triangle extends Shape {
    private int x;

    private int y;

    private int side;

    public Triangle(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public Triangle(int x, int y, int side, Color color) {
        this(x, y, side);
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRightX() {
        return x + side;
    }

    public int getRightY() {
        return y;
    }

    public int getBottomX() {
        return x + side / 2;
    }

    public int getBottomY() {
        return (int)(y + side * Math.sqrt(3) / 2);
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle [" + x + ", " + y + "] with side "
                + side + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;    //x = x + deltaX;
        y += deltaY;    //y = y + deltaY;
    }

    @Override
    public void resize(double factor) {
        side = (int) (side * factor);
    }
}
