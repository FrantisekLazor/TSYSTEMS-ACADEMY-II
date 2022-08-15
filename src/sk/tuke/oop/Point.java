package sk.tuke.oop;

public class Point extends Shape {
    protected int x;
    protected int y;
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(){
        this.x=10;
        this.y=10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Color color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    //ciara zadana 2 bodmi

    @Override
    public void draw() {
        System.out.println("drawing Point P["+this.x+","+this.y+"]");

    }

    public void sayhello() {

    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;

    }

    @Override
    public void resize(int widht, int height) {

    }

    @Override
    public void resize(int widht) {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void resize_Percentege(double Percentage) {
        this.x=(int) (this.x *Percentage);
        this.y=(int) (this.y *Percentage);


    }
    @Override
    public String toString() {
        return "Point"+super.toString();
    }
}
