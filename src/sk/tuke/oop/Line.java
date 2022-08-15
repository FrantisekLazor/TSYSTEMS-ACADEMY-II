package sk.tuke.oop;

public class Line extends Shape {

    private Point point1= new Point();
    private Point point2=new Point();

    public Line(){
        this.point1.setX(20);
        this.point1.setY(20);

        this.point2.setX(25);
        this.point2.setY(25);
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(Color color, Point point1, Point point2) {
        super(color);
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw() {
        System.out.println("drawing Line with 2 points P1["+this.point1.x+","
                +this.point1.x+"] P2["+this.point2.x+","+this.point2.y+"]");

    }

//    @Override
//    public void sayhello() {
//
//    }

    @Override
    public void move(int x, int y) {
        this.point2.x+=x;
        this.point2.y+=y;

        this.point1.x+=x;
        this.point1.y+=y;


    }

    @Override
    public void resize(int widht, int height) {

    }

    @Override
    public void resize(int widht) {

    }

    @Override
    public void resize_Percentege(double factor) {
//        to.move(int)((to.getX));
        this.point2.y=(int)( this.point2.y* factor);

    }

    //to string meni objekt na retazec
}
