package sk.tuke.oop;

public class Canvas {
    //    public static void main(String[] args) {
//        var shapes = new Shape[3];
//        shapes[0] = new Circle(8, 6, 60);
//        shapes[1] = new Rectangle(7, 20, 15, 30);
//        shapes[2] = new Square(1, 1, 55, 55);
//
//
//        for (Shape shape : shapes) {
//            shape.draw();
//        }
//
//        int deltaX = 40;
//        int deltaY = 100;
//
//        for (Shape shape : shapes) {
//            shape.move(deltaX, deltaY);
//        }
    private Shape[] shapes;

    public Canvas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void draw() {
        for (var shape : shapes)
            shape.draw();
    }

    //    }
    public void move(int deltaX, int deltaY) {
        for (var shape : shapes)
            shape.move(deltaX, deltaY);
    }
//    public void resize(float percentage) {
//        for (var shape : shapes)
//            shape.resize(percentage);
//    }
    public void resize(int length1){
        for (var shape : shapes)
            shape.resize(length1);
    }
    public void resize(int width, int height){
        for (Shape shape : shapes){
            shape.resize(width, height);
            shape.resize(width);
        }

    }
}
