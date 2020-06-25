import java.util.Scanner;

public class BankAccount {

    public static void main(String args[])
    {
        Bank bank = new Bank(4);
        Scanner sc = new Scanner(System.in);
        Bankdemo bankmenu = new Bankdemo();
        bankmenu.menu(sc,bank);

    }
    static class Bankdemo {
        public Bankdemo()
        {

        }
        public void menu(Scanner sc, Bank bank) {
            System.out.println("Press 1 to create an account, 2 to update your account, 3 to check your account, 4 to delete your account, 5 to print status of all accounts and 6 to exit menu.");
            int opt = sc.nextInt();

            {
                 {
                    if (opt == 1) {
                        bank.openaccount();
                        menu(sc, bank);
                    } else if (opt == 2) {
                        System.out.println("Please type in your account number.");
                        int accn = sc.nextInt();
                        bank.update(accn);
                        menu(sc, bank);
                    } else if (opt == 3) {
                        System.out.println("Please type in your account number.");
                        int accn = sc.nextInt();
                        bank.checkaccount(accn);
                        menu(sc, bank);
                    }
                    else if(opt==4)
                    {
                        System.out.println("Please type in your account number.");
                        int accn = sc.nextInt();
                        bank.closeaccount(accn);
                        menu(sc, bank);
                    }
                    else if(opt==5)
                    {
                        System.out.println("Checking status of all accounts");
                        bank.checkallaccounts();
                        menu(sc, bank);
                    }
                    else {
                        System.out.println("Exiting menu.");
                        return;
                    }
                }

            }
        }
    }
}
