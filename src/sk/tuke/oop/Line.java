package sk.tuke.oop;

public class Line extends Shape {
    private Point from;

    private Point to;

    public Line(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    @Override
    public void draw() {
        System.out.println("Drawing line [" + from.getX() + ", " + from.getY()
                + "] -> [" + to.getX() + ", " + to.getY() + "] with color " + getColor());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        from.move(deltaX, deltaY);
        to.move(deltaX, deltaY);
    }

    @Override
    public void resize(double factor) {
        to.move((int) ((to.getX() - from.getX()) * (factor - 1)),
                (int) ((to.getY() - from.getY()) * (factor - 1)));
    }
}
