import java.util.Scanner;

public class GPA {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age.");
        int age = sc.nextInt();
        System.out.println("Please enter your gpa.");
        double gpa = sc.nextDouble();
        boolean st1, st2;
        try {
            st1=computeage(age);
            st2=computegpa(gpa);
            if(st1 && st2)
                System.out.println("Your application is accepted and under ready.");
        }
        catch (AgeOutOfRangeException e)
        {
            System.out.println(e);
        }

        catch (LowGpaException e)
        {
            System.out.println(e);
        }

    }

    static boolean computeage(int age) throws AgeOutOfRangeException
    {
        boolean st=false;
        if(age>25) throw new AgeOutOfRangeException(age);
        else st=true;
        return st;
    }
    static boolean computegpa(double gpa) throws LowGpaException
    {
        boolean st = false;
        if(gpa<2.5) throw new LowGpaException();
        else st=true;
        return st;
    }
}
