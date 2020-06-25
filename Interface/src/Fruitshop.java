import java.time.LocalDate;
 class Fruitshop implements Shop {
    private int inventory;
    private double balance;
    int type1=0;
    int type2=0, type3=0, type4=0, type5=0;
    String s="Sold", b="Bought";
    Apple apple=new Apple();
    Orange orange=new Orange();
    Strawberies strawberies = new Strawberies();
    LogEntry[] log = new LogEntry[15];
    public void initlog(){
        for(int k=0;k<15;k++)
        {
            log[k]=new LogEntry();
        }
     }
    int i = 0;
    Fruitshop(int inventory, double balance)
    {
        this.inventory=inventory;
        this.balance=balance;
    }
    @Override
    public void buy(int type, int amount) {
        if(amount<=inventory)
        {
            if(type==1||type==2)
            {
                double price=(double)amount*apple.getBuyingPriceperunit();
                if(price<=balance)
                {
                    if(type==1) type1= type1+amount;
                    else if(type==2) type2= type2+amount;
                    balance=balance-price;
                    log[i].setTimestamp(LocalDate.now());
                    log[i].setItemname(apple.getname());
                    log[i].setSoldbought(b);
                    log[i].setItems(amount);
                    ++i;
                }
                else
                {
                    System.out.println("Not enough balance.");
                }
            }
            else if(type==3)
            {
                double price = (double)amount*orange.getBuyingPriceperunit();
                if(price<=balance)
                {
                    type3=type3+amount;
                    balance=balance-price;

                    log[i].setTimestamp(LocalDate.now());
                    log[i].setItemname(orange.getname());
                    log[i].setSoldbought(b);
                    log[i].setItems(amount);
                    ++i;

                }
                else
                {
                    System.out.println("Not enough balance");
                }
            }
            else if(type==4||type==5)
            {
                boolean st=false;
                double price = (double)amount*strawberies.getBuyingPriceperunit();
                if(price<=balance)
                {
                    if(type==4) {
                        type4 = type4 + amount;
                        st=true;
                    }
                    else if(type==5) type5=type5+amount;
                    balance=balance-price;
                    log[i].setTimestamp(LocalDate.now());
                    log[i].setItemname(strawberies.getname(st));
                    log[i].setSoldbought(b);
                    log[i].setItems(amount);
                    ++i;
                }
                else
                {
                    System.out.println("Not enough balance.");
                }
            }
        }
        else
        {
            System.out.println("Not enough Space.");
        }

    }

    @Override
    public void sell(int type, int amount) {
        if(type==1)
        {
            if(amount<=type1)
            {
                double price=(double)amount*apple.getSellingPriceperunit();
                balance=balance+price;
                type1= type1-amount;
                log[i].setTimestamp(LocalDate.now());
                log[i].setItemname(apple.getname());
                log[i].setSoldbought(s);
                log[i].setItems(amount);
                ++i;
            }
            else
            {
                System.out.println("Not enough green apples.");
            }
        }
        else if(type==2)
        {
            if (amount <= type2)
            {
                double price = (double)amount*apple.getSellingPriceperunit();
                balance=balance+price;
                type2=type2-amount;
                log[i].setTimestamp(LocalDate.now());
                log[i].setItemname(apple.getname());
                log[i].setSoldbought(s);
                log[i].setItems(amount);
                ++i;
            }

            else
            {
                System.out.println("Not enough red apples.");
            }
        }
        else if(type==3)
        {
            if(amount<=type3)
            {
                double price = (double)amount*orange.getSellingPriceperunit();
                balance=balance+price;
                type3=type3-amount;
                log[i].setTimestamp(LocalDate.now());
                log[i].setItemname(orange.getname());
                log[i].setSoldbought(s);
                log[i].setItems(amount);
                ++i;
            }

            else
            {
                System.out.println("Not enough oranges.");
            }
        }
        else if(type==4)
        {
            if(amount<=type4)
            {
                boolean st=true;
                double price = (double)amount*strawberies.getSellingPriceperunit();
                balance=balance+price;
                type4=type4-amount;
                log[i].setTimestamp(LocalDate.now());
                log[i].setItemname(strawberies.getname(st));
                log[i].setSoldbought(b);
                log[i].setItems(amount);
                ++i;
            }

            else
            {
                System.out.println("Not enough canned strawberies.");
            }
        }
        else if(type==5)
        {
            if(amount<=type5)
            {
                boolean st=false;
                double price = (double)amount*strawberies.getSellingPriceperunit();
                balance=balance+price;
                type5=type5-amount;
                type4=type4-amount;
                log[i].setTimestamp(LocalDate.now());
                log[i].setItemname(strawberies.getname(st));
                log[i].setSoldbought(b);
                log[i].setItems(amount);
                i++;
            }

            else
            {
                System.out.println("Not enough packed strawberies.");
            }
        }
    }
    public int gettransactions()
    {
        return i;
    }

    @Override
    public LogEntry getlog(int j) {
         {
            return log[j];
        }

    }
    public void getinventory()
    {
        if(type1>0||type2>0)
        {
            System.out.println(apple.getname() +" " +apple.getSellingPriceperunit() + " " +apple.getBuyingPriceperunit());
        }
        if(type3>0)
        {
            System.out.println(orange.getname() +" " +orange.getSellingPriceperunit() + " " +orange.getBuyingPriceperunit());
        }
        if(type4>0)
        {
            boolean st=true;
            System.out.println(strawberies.getname(st) +" " +strawberies.getSellingPriceperunit() + " " +strawberies.getBuyingPriceperunit());
        }
        if(type5>0)
        {   boolean st=false;
            System.out.println(strawberies.getname(st) +" " +strawberies.getSellingPriceperunit() + " " +strawberies.getBuyingPriceperunit());
        }
    }

    @Override
    public double getbalance() {
        return balance;
    }
}
