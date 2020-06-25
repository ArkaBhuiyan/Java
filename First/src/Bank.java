import java.util.Scanner;

public class Bank {
    private Account account[] = null;
    private int limit;
    private int cnt;
    public Bank(int limit)
    {
        this.limit=limit;
        account = new Account[limit];
        this.cnt = 0;
    }
    public void opensaving(int accn, double interest)
    {
        account[cnt] = new SavingsAccount( accn,interest);
        cnt++;
    }
    public void opencurrent(int accn,double overlimit)
    {
        account[cnt]= new CurrentAccount(accn,overlimit);
        cnt++;
    }
    public int getaccount(int accn)
    {
       try {
           for (int i = 0; i < account.length; i++) {
               if (account[i].getAccountNumber() == accn) {
                   return i;

               }
           }
       }
       catch (NullPointerException e)
        {
         return -1;
        }
        return -1;
    }
    public void openaccount() {
        boolean state = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type 1 for creating savings account or type 2 for current account or 3 for exit..");
        int option = sc.nextInt();
        {
            if (option == 1) {
                if (cnt < limit) {
                    System.out.println("Please type in the account number. We allot 5% interest on savings account.");
                    int ac = sc.nextInt();
                    int status = getaccount(ac);
                    if (status == -1) {
                        opensaving(ac, 5.00);
                        openaccount();
                    } else {
                        System.out.println("This account number is in use. Please try another.");
                        openaccount();
                    }

                } else {
                    System.out.println("Sorry, we do not have spaces to have more account.");
                    //openaccount();

                }
            } else if (option == 2) {
                if (cnt < limit) {
                    System.out.println("Please type in the account number. Overdraft limit is fixed for 200 taka");
                    int ac = sc.nextInt();
                    int status = getaccount(ac);
                    if (status == -1) {
                        opencurrent(ac, 200.00);
                        openaccount();
                    } else {
                        System.out.println("This account number is in use. Please try another.");
                        openaccount();

                    } }
                else{
                        System.out.println("Sorry, we do not have spaces to have more account.");
                        //openaccount();
                    }

                } else {
                    System.out.println("Returning to main menu.");

                }

            }
        }


    public void closeaccount(int accn)
    {
        int i = getaccount(accn);
        if(i>-1) {
            account[i] = null;
            cnt = cnt - 1;
        }
        else
                System.out.println("No account exists.");

    }
    public void checkaccount(int accn)
    {
        int i = getaccount(accn);
        if(i>-1) {
            if (account[i] instanceof SavingsAccount) {
                ((SavingsAccount) (account[i])).printstatus();
            } else if (account[i] instanceof CurrentAccount) {
                ((CurrentAccount) (account[i])).printstatus();
            }
        }
        else
        {
            System.out.println("No account exists with this account no. .");
        }
    }
    public void deposit(int index,int accn, double sum)
    {
        //int index = -1;
        if(account[index].getAccountNumber()==accn)
        {
            account[index].deposit(sum);
        }
    }
    public void withdraw(int index, int accn, double sum)
    {
        if(account[index].getAccountNumber()==accn)
        {
            if(account[index] instanceof CurrentAccount) {
                ((CurrentAccount)(account[index])).withdraw(sum);
            }
            else
            {
                account[index].withdraw(sum);
            }
        }
    }
    public void addinterest(int index, int accn)
    {
        if(account[index].getAccountNumber()==accn)
        {
            if(account[index] instanceof SavingsAccount)
            {
                ((SavingsAccount)(account[index])).addinterest();
            }
            else
            {
                System.out.println("Your account is not a savings account.");
            }
        }
    }
    public void update(int accn) {
        int index = getaccount(accn);

        Scanner sc = new Scanner(System.in);
        if (index > -1) {
            System.out.println("Press 1 to deposit money, 2 to withdraw money and 3 to add interest.");
            int opt = sc.nextInt();
            if (opt == 1) {

                System.out.println("Please input the sum ammount.");
                int sum = sc.nextInt();
                deposit(index, accn, sum);
                System.out.println("Process done. Returning to menu.");

            } else if (opt == 2) {

                System.out.println("Enter the withdrawal amount.");
                int with = sc.nextInt();
                withdraw(index, accn, with);
            } else {
                addinterest(index, accn);
            }
        }
        else
        {
            System.out.println("No account exists with this account no. .");
        }
    }
    public void checkallaccounts() {
        if(cnt>0) {
            for (int i = 0; i < cnt; i++) {
                if (account[i] instanceof SavingsAccount) {
                    ((SavingsAccount) (account[i])).printstatus();
                } else if (account[i] instanceof CurrentAccount) {
                    ((CurrentAccount) (account[i])).printstatus();
                }
            }
        }
        else
        {
            System.out.println("Currently no account is registered.");
        }
    }
    }


