public class Strawberies extends ShopItem {
    private boolean canpack;
    double buyprice=8.0;
    double sellprice = 10.0;
    Strawberies()
    {

    }
    Strawberies(boolean canpack)
    {
        this.canpack=canpack;
    }
    public String getname(boolean st)
    {
        if (st)
            return "Canned Strawberries";
        return "Packed Strawberries";
    }
    public double getBuyingPriceperunit() {
        return buyprice;
    }

    public double getSellingPriceperunit() {
        return sellprice;
    }

    public void setBuyingPriceperunit() {
        super.setBuyingPriceperunit(buyprice);
    }

    public void setSellingPriceperunit() {
        super.setSellingPriceperunit(sellprice);
    }
}
