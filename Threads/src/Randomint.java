import java.util.Random;

public class Randomint implements Runnable {
    Thread t;
    Randomint()
        {
            t = new Thread(this,"Ranodom number generating thread.");
            System.out.println("Number generation started.");
            t.start();
        }
    public void run() {
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Random number generating thread interrupted.");
        }
        System.out.println("Number generation thread exited.");

    }
    public int randint()
    {
        Random rand = new Random();
        int r= rand.nextInt(50);
        System.out.println("The random number is " + r);
        return r;
    }
}
