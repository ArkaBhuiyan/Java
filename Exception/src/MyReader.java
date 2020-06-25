import java.util.Scanner;

public class MyReader {
    static int readinteger(String s) throws NotIntegerException
    {
        if(s.contains("."))
        {
            double d = Double.parseDouble(s);
            throw new NotIntegerException(d);
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
             int d =readinteger(s);
             System.out.println("The integer is " + d);
        }
        catch (NotIntegerException e)
        {
            System.out.println(e);
        }
    }
}
