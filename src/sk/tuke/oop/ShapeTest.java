package sk.tuke.oop;

public class ShapeTest {
    public static void main(String[] args) {
        var point1 = new Point(10, 10);
        var point2 = new Point(50, 30);
        var line = new Line(new Point(10, 10), new Point(50, 30));

        line.draw();

        point1.move(10, 10);

        line.draw();


//        var circle = new Circle(10, 5, 20);
//        System.out.println(circle);

//        var rectangle = new Rectangle(3, 4, 20, 10);
//
//        circle.setColor(Color.GREEN);
//        rectangle.setColor(Color.YELLOW);
//
////        circle.draw();
////        rectangle.draw();
//
//        var triangle = new Triangle(12, 13, 8, Color.YELLOW);
//
//        var shapes = new Shape[4];
//        shapes[0] = circle;
//        shapes[1] = rectangle;
//        shapes[2] = new Square(5, 6, 10, Color.RED);
//        shapes[3] = triangle;
//
//        var canvas = new Canvas(shapes);
//        canvas.draw();
//        canvas.resize(0.5);
//        System.out.println();
//        canvas.draw();
//
//        System.out.println(triangle.getRightX());
//        System.out.println(triangle.getRightY());
//
//        System.out.println(triangle.getBottomX());
//        System.out.println(triangle.getBottomY());
//
//        var shapesForCanvas2 = new Shape[2];
//        shapesForCanvas2[0] = new Circle(0, 0, 10);
//        shapesForCanvas2[1] = circle;
//        shapesForCanvas2 = shapes;
//        new Canvas(shapesForCanvas2);
    }
}
