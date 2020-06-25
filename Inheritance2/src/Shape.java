abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape()
    {
        this.color="green";
        this.filled=true;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

}
