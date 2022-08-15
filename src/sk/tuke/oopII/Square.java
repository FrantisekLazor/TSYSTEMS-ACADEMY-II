package sk.tuke.oopII;

public class Square extends Shape{
    private int x;

    private int y;

    private int side;

    public Square(int x, int y, int side) {
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
