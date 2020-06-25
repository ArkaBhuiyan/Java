public class Circle extends Shape {
    protected double radius;
    Circle()
    {
        super();
        this.radius=1.0;
    }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius)
    {
        super();
        this.radius=radius;
    }
    Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius=radius;
    }
    protected double getarea()
    {
        return 3.14 * radius * radius;
    }
    protected double getperimeter()
    {
        return 2.0 * 3.14 * radius;
    }
}
