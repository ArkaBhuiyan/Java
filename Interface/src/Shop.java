public interface Shop {
    void buy(int type, int amount);
    void sell(int type, int amount);
    LogEntry getlog(int j);
    double getbalance();

}
