public class IllegalArgumentException extends Exception {
    String s;
    IllegalArgumentException(String s)
    {
        this.s= s;
    }
    public String toString()
    {
        return s;
    }
}
