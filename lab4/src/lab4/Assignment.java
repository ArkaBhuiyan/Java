package lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Assignment {

    public static void main(String args[]) throws FileNotFoundException {

        FileReader fn = new FileReader("file.txt");

        Scanner sc = new Scanner(fn);

        Wallet w = new Wallet();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];
            String denom = parts[1];

            if (parts[0].equals("Paper")) {
                String part3 = parts[2];
                String part4 = parts[3];
                if (part4.equals("authentic")) {
                    RealPaper ob = new RealPaper(Integer.parseInt(denom), part3);
                    w.AddMoney(ob);
                }

                if (part4.equals("counterfeit")) {
                    FakePaper ob = new FakePaper(Integer.parseInt(denom), part3);
                    w.AddMoney(ob);
                }
                // System.out.println(type + " " + denom + " " + part3 + " " + part4);
            } else {
                String part3 = parts[2];
                Coin co = new Coin(Integer.parseInt(denom), part3);
                w.AddMoney(co);
                // System.out.println(type + " " + denom + " " + part3 );
            }
        }
        w.PrintSummary();
    }
}
