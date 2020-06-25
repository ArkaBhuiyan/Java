public class FakePaper extends Paper {
    FakePaper(int value, String state, boolean autographed) {
        super(value, state, autographed);
    }
    protected int gettruevalue()
    {
        return 0;
    }
}
