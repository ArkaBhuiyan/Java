import java.util.InputMismatchException;
import java.util.Scanner;
public class Task3 {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            try {
            int x,n=sc.nextInt();
            int a[]=new int[n];

                a[5] = 99;
                x = n / 0;
            }
            catch (InputMismatchException e)
            {
                System.out.println(e);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

            finally {
                System.out.println("THE END");
            }

        }
}
