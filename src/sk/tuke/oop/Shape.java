package sk.tuke.oop;

public abstract class Shape {
    private Color color = Color.BLUE;

    public Shape(){

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

    public abstract void draw(); // kaydz utvar musi mat shape

    public abstract void move(int deltaX, int deltaY);// nemam tu ani x ani y tak tu neviem zadefinovat move preto musim dat abstract

//    public abstract void resize(float percentage);
    public abstract void resize(int length1);
    public abstract void resize(int width, int height);

    public abstract void resize_Percentege(double Percentage);

//    public abstract void resize(int point1, int point2);
//    public abstract void showPoints(int p, int q);
}

