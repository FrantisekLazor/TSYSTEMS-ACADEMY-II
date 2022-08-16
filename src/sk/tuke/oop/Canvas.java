package sk.tuke.oop;

public class Canvas {
    private Shape[] shapes;

    public Canvas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void draw() {
        for (var shape : shapes)
            shape.draw();
    }

    public void move(int deltaX, int deltaY) {
        for (var shape : shapes)
            shape.move(deltaX, deltaY);
    }

    public void resize(double factor) {
        for (var shape : shapes)
            shape.resize(factor);
    }
}
