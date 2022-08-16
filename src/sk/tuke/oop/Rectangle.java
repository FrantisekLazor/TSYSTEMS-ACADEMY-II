package sk.tuke.oop;

public class Rectangle extends Shape {
    private int x;

    private int y;

    private int width;

    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(Color.YELLOW);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this(x, y, width, height);
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getRightX() {
        return x + width;
    }

    public int getBottomY() {
        return y + height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle [" + x + ", " + y + "] with width "
                + width + ", height " + height + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;    //x = x + deltaX;
        y += deltaY;    //y = y + deltaY;
    }

    @Override
    public void resize(double factor) {
        width = (int) (width * factor);
        height = (int) (height * factor);
    }
}
