import java.util.Scanner;

public class EquationSolve {
    static double root(double A, double B, double C)
            throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        }
        else {
            double disc = B*B - 4*A*C;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminant < zero.");
            return (-B + Math.sqrt(disc)) / (2*A);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st="no";
        double a,b,c;
        boolean x=true;
        System.out.println("Please type your equation.");
        while (x){
            a= sc.nextDouble();
            b= sc.nextDouble();
            c= sc.nextDouble();
            try
            {
                double d =root(a,b,c);
                System.out.println("The solution is "+ d);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e);
            }
        System.out.println("Do you want to give more equations?");
            st = sc.next();
            if (st.equals("no")) {
                x=false;
            }
        }
    }
}
