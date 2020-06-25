 
import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {

        String min = "";
        String max = "";
       
        for(int i=0;i<=s.length()-k;i++)
        {
            String temp ="";
            for(int j=i; j<i+k; j++)
            {
                temp = temp + s.charAt(j);

            }
            if(i==0)
            {
                min = temp;
                max = temp;
            }
            else
            {
                if(temp.compareTo(min)<0)
                {
                    min = temp;
                }
                if(temp.compareTo(max)>0)
                {
                    max = temp;
                }
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return min + "\n" + max;
}





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
