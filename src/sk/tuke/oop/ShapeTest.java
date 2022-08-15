package sk.tuke.oop;

public class ShapeTest {
    public static void main(String[] args) {
        var circle = new Circle(10, 5, 20);
        var rectangle = new Rectangle(3, 4, 20, 10);
        var square = new Square(1, 1, 50, 50);
        var triangle = new Triangle(4, 5,10);
        var point = new Point(5,10);
        //var line = new Line(5,15);

//        Shape shape;
//        shape = circle;
//        shape = rectangle;
        circle.setColor(Color.GREEN);
        rectangle.setColor(Color.YELLOW);
        square.setColor(Color.RED);
//        var shape = new Shape();
        circle.draw();
        rectangle.draw();
        square.draw();
        triangle.draw();
        var shapes = new Shape[6];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = new Square(5,6,12,12);
        shapes[3] = new Triangle(4,5,10);
        shapes[4] = new Point(4,5);
        //shapes[5] = new Line(6,20);
//      shapes[4]
//
//        for(var shape : shapes)
//            shape.draw();

    var canvas = new Canvas(shapes);
    canvas.draw();
//        var color = Color.GREEN;

        canvas.move(2,3);
        System.out.println("--------------resize ----");
        canvas.resize(5,5);
        System.out.println();
        canvas.draw();
        //circle.resize(factor: 0.2)
//        System.out.println(triangle.getRightX());
//        System.out.println(triangle.getRightY());
//        System.out.println(triangle.getBottomX());
//        System.out.println(triangle.getBottomY());
        point.draw();
        //line.draw();


    }
}
