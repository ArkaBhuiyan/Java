public class MyException extends Exception {
    int i;
    MyException(int a)
    {
        i=a;
    }
    public String toString()
    {
        return "My Exception [" +i+ "]";
    }
}
