package sk.tuke.oop;

public abstract class Shape {
    private Color color = Color.BLUE;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract void move(int deltaX, int deltaY);

    public abstract void resize(double factor);
}
