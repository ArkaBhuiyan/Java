public class Apple extends ShopItem {
    public boolean greenorred;
    Apple()
    {

    }
    Apple(boolean greenorred)
    {
        this.greenorred= greenorred;
    }

    public double buyprice=5;
    public double sellprice=8;

    public String getname()
    {
        return "Apple";
    }

    public void setBuyingPriceperunit() {
        super.setBuyingPriceperunit(buyprice);
    }


    public void setSellingPriceperunit() {
        super.setSellingPriceperunit(sellprice);
    }


    public double getBuyingPriceperunit() {
        return buyprice;
    }


    public double getSellingPriceperunit() {
        return sellprice;
    }
}
