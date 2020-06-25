public class Coin extends Money {
    protected boolean golden;
    Coin(int value,  boolean golden) {
        super(value);
        this.golden=golden;
    }
    protected int getvalue()
    {
        if(golden)
            return value+20;
        return value;
    }
}
