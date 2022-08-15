package sk.tuke.oopII;

public class Triangle extends Shape{

    private int x;

    private int y;

    private int side;

    public Triangle(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSide() {
        return side;
    }
}
