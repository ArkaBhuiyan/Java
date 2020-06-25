class InvalidRadiusException extends Exception {
    private double r;
    public InvalidRadiusException(double radius){
        r = radius;
    }
    public void printError(){
        System.out.println("Radius [" + r + "] is not valid");
    }
}

class Circle {
    double x, y, r;

    public Circle(double centreX, double centreY, double radius) throws
            InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException(radius);
        } else {
            x = centreX;
            y = centreY;
            r = radius;
        }
    }
}

class CircleTest {
    public static void main(String[] args){
        try{
            Circle c1 = new Circle(10, 10, -1);
            System.out.println("Circle created");
        }
        catch(InvalidRadiusException e)
        {
            e.printError();
        }
    }
}
