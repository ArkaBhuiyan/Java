import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int j = sc.nextInt();
            list.add(j);
        }
        int q = sc.nextInt();
        for(int i =0; i<q; i++)
        {
            sc.nextLine();
            String op = sc.next();
            if(op.equals("Insert"))
            {
                int index = sc.nextInt();
                int ele = sc.nextInt();
                    list.add(index, ele);

            }
            else if(op.equals("Delete"))
            {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}