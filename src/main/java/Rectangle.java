import java.awt.*;

@SuppressWarnings("WeakerAccess")
public class Rectangle {

    private double x1, y1;
    private double x2, y2;
    private Color color;

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double x1() {
        return x1;
    }
    public double y1() {
        return y1;
    }
    public double x2() {
        return x2;
    }
    public double y2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}