package sk.tuke.oop;

public class Square extends Shape {
    private int x;

    private int y;

    private int width;

    private int height;


    public Square(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Square(int x, int y, int width, int height, Color color) {
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

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square [" + x + "," + y + "] with width " + width + ", height " + height + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
//        System.out.println("square move from x:" + x + " y:" + y + " to x:" + deltaX + " to y:" + deltaY);
        x += deltaX;
        y += deltaY;
    }
 //   @Override
//    public void resize(float percentage) {
//        width *= percentage;
//        height *= percentage;
    public void resize(int length1){

    }

    @Override
    public void resize(int width, int height) {
        this.width += width;
        this.height += height;
    }

    @Override
    public String toString() {
        return "Square [" + x + "," + y + "] with width " + width + ", height " + height + " and color " + getColor();
    }
    //    @Override
//    public void showPoints(int p, int q) {
//        p = x+width;
//        q= y+height;
    }


