public class ShopItem {
    private String name;
    private double sellingPriceperunit;
    private double buyingPriceperunit;
    ShopItem()
    {

    }
    public String getName()
    {
        return name;
    }
    public void setBuyingPriceperunit(double buyingPriceperunit) {
        this.buyingPriceperunit = buyingPriceperunit;
    }

    public void setSellingPriceperunit(double sellingPriceperunit) {
        this.sellingPriceperunit = sellingPriceperunit;
    }

    public double getBuyingPriceperunit() {
        return buyingPriceperunit;
    }

    public double getSellingPriceperunit() {
        return sellingPriceperunit;
    }
}
