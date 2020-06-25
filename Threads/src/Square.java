public class Square implements Runnable {
    Thread t;
    int n;
    Square(int n)
    {
        this.n=n;
        t = new Thread(this, "square thread");
        //t.start();
    }
    @Override
    public void run() {
            try {
                printsquare();
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Square thread interrupted.");
            }
            System.out.println("Exiting square thread.");

    }
    public void printsquare()
    {
        System.out.println("The square of " + n +" is " + n*n);
    }
}
