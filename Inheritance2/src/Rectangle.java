import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    Rectangle()
    {
        super();
        this.width=1.0;
        this.length=1.0;
    }
    Rectangle(double width, double length)
    {
        super();
        this.length=length;
        this.width=width;
    }
    Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    protected double getarea()
    {
        return width * length;
    }

    protected double getperemeter()
    {
        return 2.0 * width * length;
    }

}
