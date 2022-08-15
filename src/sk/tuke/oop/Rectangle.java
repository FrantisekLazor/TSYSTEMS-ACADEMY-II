package sk.tuke.oop;

public class Rectangle extends Shape {
    private int x;

    private int y;

    private int width;

    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    public int getXheight() {
        return height;
    }

    public int getRightX() {
        return x + width;
    }
    public int getBottomY() {
        return x + height;
    }


    @Override
    public void draw() {
        System.out.println("Drawing rectangle [" + x + "," + y + "] with width " + width + ", height " + height + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
//        System.out.println("rectangle move from x:" + x + " y:" + y + " to x:" + deltaX + " to y:" + deltaY);
        x += deltaX;
        y += deltaY;
    }

    @Override
    public void resize(int length1) {

    }

  //  @Override
//    public void resize(float percentage) {
//        width *= percentage;
//        height *= percentage;

    public void resize(int width, int height){
        this.width += width;
        this.height += height;
    }

    @Override
    public String toString() {
        return "Rectangle [" + x + "," + y + "] with width " + width + ", height " + height + " and color " + getColor();
    }
}


