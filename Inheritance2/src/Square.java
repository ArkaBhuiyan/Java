public class Square extends Rectangle {
    Square()
    {
        super();
    }
    Square(double side)
    {
        super(side, side);
    }
    Square(String color, boolean filled, double side)
    {
        super(color,filled,side,side);
    }

    @Override
    protected double getarea() {
        return super.getarea();
    }

    @Override
    protected double getperemeter() {
        return super.getperemeter();
    }
}
