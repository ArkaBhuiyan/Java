public class NotIntegerException extends Exception {
    double a;
    NotIntegerException(double a)
    {
        this.a=a;
    }
    public String toString()
    {
        return a + " is not an integer.";
    }
}
