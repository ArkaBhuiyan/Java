abstract class Paper extends Money {
    protected boolean autographed;
    protected String state;
    Paper(int value, String state, boolean autographed) {
        super(value);
        this.state=state;
        this.autographed=autographed;
    }
    protected int getvalue()
    {
        if(autographed)
            return value+10;

        return value;
    }
}
