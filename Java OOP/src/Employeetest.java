import java.util.InputMismatchException;
import java.util.Scanner;

public class Employeetest {
    public static void main(String[] args)
    {
        Employee[] employee = new Employee[5];
         int cnt=0;
        Scanner sc = new Scanner(System.in);
        employeedemo employmenu = new employeedemo();
        employmenu.menu(sc,employee,cnt);
    }
    static class employeedemo
    {
        public employeedemo()
        {

        }
        public void menu(Scanner sc, Employee em[], int cnt)
        {
            System.out.println("Please type 1 to create account, 2 to edit your account, 3 to view account and 4 to exit.");
            int opt = sc.nextInt();

            if(opt==4)
            {
                System.out.println("Exiting menu");
                return;
            }
            else if(opt==1)
            {
                if(cnt<5) {
                    sc.nextLine();
                    System.out.println("please type in your information");
                    System.out.println("Enter your name.");

                    String name = sc.nextLine();
                    System.out.println("Enter your salary.");
                    double salary = sc.nextDouble();
                    System.out.println("Enter your joining year.");
                    int year = sc.nextInt();
                    System.out.println("Enter your insurance number.");
                    String ins = sc.next();
                    em[cnt++] = new Employee(name, salary, year, ins);
                    System.out.println("Account created successfully");
                    menu(sc, em, cnt);
                }
                else
                {
                    sc.nextLine();
                    System.out.println("No more entry is allowed.");
                    menu(sc, em, cnt);
                }
            }
            else if(opt==2) {
                sc.nextLine();
                System.out.println("Please type in your name");
                String name = sc.nextLine();
                try {

                    for (int i = 0; i < em.length; i++) {

                            boolean state = em[i].equals(name);
                            if (state) {
                                em[i].update();
                                break;


                            }
                            }
                        }
                catch (NullPointerException e) {
                    System.out.println("No account found.");

                    }
                System.out.println("Returing to main menu.");
                menu(sc, em, cnt);

            }
            else if(opt==3)
            {
                sc.nextLine();
                System.out.println("Please type in your name");
                String name = sc.nextLine();
                try
                {
                for(int i =0; i<em.length;i++)
                {
                        boolean state = em[i].equals(name);
                        if(state)
                        {
                            em[i].print();
                            break;
                        }
                    }
                }
                catch (NullPointerException e)
                {
                    System.out.println("No account found.");
                }
                System.out.println("Returning to main menu.");
                menu(sc, em, cnt);

            }

        }
    }
}

