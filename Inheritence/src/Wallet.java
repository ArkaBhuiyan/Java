public class Wallet {
    public Money[] moneybag=null;
    public int limit;
    public int count;
    public int totalvalue;
    Wallet(int limit)
    {
        this.limit=limit;
        moneybag= new Money[limit];
        count=0;
        totalvalue=0;
    }
    public void addcoinmoney(int value, boolean golden)
    {
        if(count<limit)
        {
            moneybag[count]=new Coin(value, golden);
            totalvalue+=((Coin)(moneybag[count])).getvalue();
            System.out.println("Money added.");
        }
        else
        {
            System.out.println("money not added.");
        }
        count++;
    }
    public void addpapermoney(int value, String state, boolean auto)
    {
        if(count<limit)
        {
            if(state.equals("authentic"))
            {
                moneybag[count]=new RealPaper(value,state,auto);
                totalvalue+=((RealPaper)(moneybag[count])).getvalue();
                System.out.println("Money added.");
            }
            else if(state.equals("counterfeit"))
            {
                moneybag[count]=new FakePaper(value,state,auto);
                totalvalue+=((FakePaper)(moneybag[count])).gettruevalue();
                System.out.println("Money not added.");
            }
        }
        count++;
    }
    public void printsummery()
    {
        for(int i=0;i<limit;i++)
        {
            if(moneybag[i] instanceof Coin)
            {
                if(((Coin)(moneybag[i])).golden)
                {
                    System.out.println("Object #"+(i+1)+" is a "+((Coin)(moneybag[i])).value+" dollar golden coin worth "+((Coin)(moneybag[i])).getvalue()+" dollars.");
                }
                else
                {
                    System.out.println("Object #"+(i+1)+" is a "+((Coin)(moneybag[i])).value+" dollar normal coin worth "+((Coin)(moneybag[i])).getvalue()+" dollars.");
                }
            }
            else if(moneybag[i] instanceof RealPaper)
            {
                if(((RealPaper)(moneybag[i])).autographed)
                {
                    System.out.println("Object #"+(i+1)+" is an authentic autographed "+ ((RealPaper)(moneybag[i])).value +" dollar bill worth "+((RealPaper)(moneybag[i])).getvalue() + " dollars.");
                }
                else
                {
                    System.out.println("Object #"+(i+1)+" is an authentic non-autographed "+ ((RealPaper)(moneybag[i])).value +" dollar bill worth "+((RealPaper)(moneybag[i])).getvalue() + " dollars.");
                }
            }
            else if(moneybag[i] instanceof FakePaper)
            {
                if(((FakePaper)(moneybag[i])).autographed)
                {
                    System.out.println("Object #"+(i+1)+" is an counterfeit autographed "+ ((FakePaper)(moneybag[i])).value +" dollar bill worth "+((FakePaper)(moneybag[i])).gettruevalue() + " dollars.");
                }
                else
                {
                    System.out.println("Object #"+(i+1)+" is an counterfeit non-autographed "+ ((FakePaper)(moneybag[i])).value +" dollar bill worth "+((FakePaper)(moneybag[i])).gettruevalue() + " dollars.");
                }
            }
        }
    }
    public void printtotalvalue()
    {
        System.out.println("The total value is "+totalvalue+" dollars.");
    }

}
