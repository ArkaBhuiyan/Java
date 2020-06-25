import java.io.InputStream;
import java.util.*;

class Add{
    private int a[],n;
   // Add(int a[],int n){
     //   this.a=a;
       // this.n=n;

    //}
    void seta(int b[]){
        a=b;

    }
    void setn(int m){
        n=m;
    }

    int sum()
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            temp+=a[i];
        }
        return temp;

    }
}
public class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q[] = new int[p];
        for(int i=0;i<p;i++)
        {
            q[i]=0;
        }
        for(int i=0;i<p;i++)
        {
            q[i]=sc.nextInt();
        }
        Add ad = new Add();
        ad.seta(q);
        ad.setn(p);
        int z = ad.sum();
        System.out.println("The sum is "+z);

    }
}
