public class SavingsAccount extends Account {
    private double interest;
    public SavingsAccount(int a, double interest ) {
        super(a);
        this.interest= interest;
    }
    public void deposit(double sum)
    {
        //double money = super.getBalance();
        super.deposit(sum);
    }
    public void addinterest()
    {
        double bal = super.getBalance();
        double amount = (bal*interest)/100;
        deposit(amount);
    }
    public void printstatus()
    {
        System.out.println(super.toString());
    }
}
