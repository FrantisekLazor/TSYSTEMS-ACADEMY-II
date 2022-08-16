package sk.tuke.oop;

public class Square extends Shape {
    private int x;

    private int y;

    private int size;

    public Square(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Square(int x, int y, int size, Color color) {
        this(x, y, size);
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square [" + x + ", " + y + "] with size "
                + size + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;    //x = x + deltaX;
        y += deltaY;    //y = y + deltaY;
    }

    @Override
    public void resize(double factor) {
        size = (int) (size * factor);
    }
}
