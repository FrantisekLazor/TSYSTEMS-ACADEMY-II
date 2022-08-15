package sk.tuke.oop;

public class Triangle extends Shape{
    private int x;

    private int y;

    private int lenght;

    public Triangle(int x, int y, int lenght) {
        this.x = x;
        this.y = y;
        this.lenght = lenght;
    }

    public Triangle(int x, int y, int lenght, Color color) {
        this.x = x;
        this.y = y;
        this.lenght = lenght;
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLenght() {
        return lenght;
    }

    public int getRightX(){
        return x + lenght;
    }
    public int getRightY(){
        return y;
    }
    public int getBottomX(){
        return x + lenght /2;
    }
    public int getBottomY(){
        return (int)(y + lenght * Math.sqrt(3)/2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle [" + x + "," + y + "] with length " + lenght + " and color " + getColor());

    }
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }
 //   @Override
//    public void resize(float percentage) {
//        lenght *= percentage;

//    }
    public void resize(int length1){
        lenght += length1;

    }

    @Override
    public void resize(int width, int height) {

    }
}
