package sk.tuke.oop;

public class Circle extends Shape {

    private int x;

    private int y;

    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(int x, int y, int radius, Color color) {
        this.x = x;   //this(x, y, radius)
        this.y = y;
        this.radius = radius;
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
        System.out.println("Drawing circle [" + x + "," + y + "] with radius " + radius + " and color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
//        System.out.println("circle move from x:" + x + " y:" + y + " to x:" + deltaX + " to y:" + deltaY);
        x += deltaX; //x=x+ deltaX
        y += deltaY;
    }
//    @Override
//    public void resize(float percentage) {
//        radius *= percentage;

//    }
    public void resize(int length1){
        radius += length1;
}

    @Override
    public void resize(int width, int height) {
//        public void resize(double factor) {
//radius = (int) (radius * factor); musime dat int do zatvorky aby sme dali radius * factor na int lebo radius * factor je double
//int * double je double
//
//        }
    }
    @Override
    public String toString() {
        return "Circle [" + x + "," + y + "] with radius " + radius + " and color " + getColor();
    }


    }
