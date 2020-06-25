public class Cube implements Runnable {
    Thread t;
    int n;
    Cube(int n)
    {
        this.n=n;
        t = new Thread(this, "cube thread");

    }
    @Override
    public void run() {
        try {
            printcube();
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Cube thread interrupted.");
        }
        System.out.println("Exiting cube thread.");
    }
    public void printcube()
    {
        System.out.println("The cube of " + n + " is " + n*n*n);
    }
}
