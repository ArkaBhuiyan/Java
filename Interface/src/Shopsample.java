public class Shopsample {
    public static void main(String[] args)
    {
        Fruitshop fruitshop = new Fruitshop(30,100);
        System.out.println(fruitshop.getbalance());
        fruitshop.initlog();
        fruitshop.buy(1, 10);
        System.out.println(fruitshop.getbalance());
        fruitshop.sell(1, 5);
        System.out.println(fruitshop.getbalance());
        fruitshop.buy(4, 5);
        fruitshop.buy(4, 2);
        fruitshop.sell(4, 5);
        fruitshop.sell(1, 2);
        fruitshop.buy(3, 6);
        fruitshop.buy(4, 2);
        fruitshop.buy(5, 3);
        fruitshop.sell(4,1);
        fruitshop.sell(4,1);
        fruitshop.sell(4,1);
        fruitshop.sell(4,1);
        fruitshop.sell(4,1);
        System.out.println(fruitshop.getbalance());
        System.out.println("Generated Logs...");
        System.out.println("Time Stamp"+"\t"+"Name"+"\t"+"Amount"+"\t"+"BoughtOrSold");
        int j = fruitshop.gettransactions();
        LogEntry[] logEntry = new LogEntry[j];
        for(int i =0; i<j; i++)
        {
            logEntry[i]=fruitshop.getlog(i);
            System.out.println(logEntry[i].tostring());
        }
        System.out.println("Items in inventory...");
        System.out.println("Name"+" " +"Buying Price"+" " +"Selling Price");
        fruitshop.getinventory();

    }
}
