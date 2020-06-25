import java.util.Arrays;

public class Maxnumber implements Runnable {
    int arr[] = new int[4];
    Thread t;
    String threadname="maxthread";
    Maxnumber(int arr[], int count)
    {
        threadname=threadname+count;
        this.arr=arr;
        t = new Thread(this, threadname);
        t.start();
        System.out.println(threadname + " started.");
        System.out.println("The array is "+ Arrays.toString(arr));
    }
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println(threadname + " finished executed.");
    }
    public int getmax()
    {
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        System.out.println("found max " + max + " from " + threadname);
        return max;
    }
}
