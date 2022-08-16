package sk.tuke.oop;

public class Point extends Shape {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing point [" + x + ", " + y + "] with color "
                + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;    //x = x + deltaX;
        y += deltaY;    //y = y + deltaY;
    }

    @Override
    public void resize(double factor) {
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
