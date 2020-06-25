import java.util.Arrays;
import java.util.Random;

public class Findmax {
    public static void main(String args[])
    {
        int count = 1;
        int arr[] = new int[16];
        for(int i=0;i<arr.length;i++)
        {
            Random rand = new Random();
            arr[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int temp[] = new int[4];
        int[] ar1 = new int[4];
        int[] ar2 = new int[4];
        int[] ar3 = new int[4];
        int[] ar4 = new int[4];
        ar1= Arrays.copyOfRange(arr,0,4);
        ar2= Arrays.copyOfRange(arr, 4,8);
        ar3 = Arrays.copyOfRange(arr, 8,12);
        ar4 = Arrays.copyOfRange(arr, 12, 16);
        Maxnumber mx1 = new Maxnumber(ar1,count++);
        temp[0] = mx1.getmax();
        try
        {
            mx1.t.join();
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted.");
        }
        Maxnumber mx2 = new Maxnumber(ar2,count++);
        temp[1] = mx2.getmax();
        try {
            mx2.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        Maxnumber mx3 = new Maxnumber(ar3,count++);
        temp[2] = mx3.getmax();
        try
        {
            mx3.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        Maxnumber mx4 = new Maxnumber(ar4,count++);
        temp[3] = mx4.getmax();
        try {
            mx4.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("The max is " + temp[temp.length-1]);

    }
}
