public class Orange extends ShopItem {
    Orange()
    {

    }
    double buyprice=5.00;
    double sellprice=8.00;
    public String getname()
    {
        return "Orange";
    }
    public void setSellingPriceperunit() {
        super.setSellingPriceperunit(sellprice);
    }

    public void setBuyingPriceperunit() {
        super.setBuyingPriceperunit(buyprice);
    }

    public double getSellingPriceperunit() {
        return sellprice;
    }

    public double getBuyingPriceperunit() {
        return buyprice;
    }
}
