public class CurrentAccount extends Account {
    private double overdraft;
    public CurrentAccount(int a,double overdraft)
    {
        super(a);
        this.overdraft=overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public void deposit(double money)
    {
        super.deposit(money);
        double bal = super.getBalance();
        if(bal<overdraft)
        {
            System.out.println("Your Bank balance is below overdraft value, please increase your credit money.");
        }
    }
    @Override
    public void withdraw(double sum) {
        double bal = super.getBalance();
        if(sum>0 && sum<overdraft)
        {
            super.withdraw(sum);
        }
        else {
            System.out.println("Your Bank balance is below overdraft value, please increase your credit money.");
        }
    }
    public void printstatus()
    {
        System.out.println(super.toString());
    }
}
