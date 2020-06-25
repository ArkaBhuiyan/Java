import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Assignment {
    public static void main(String[] args) {
        String st1 = "Paper";
        String st2 = "Coin";
        int lines=0;
        try {
            FileReader fn = new FileReader("info.txt");
            Scanner sc = new Scanner(fn);

            while(sc.hasNextLine()) {
                sc.nextLine();
                lines++;

            }
           //System.out.println(lines);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error reading file.");
        }
        Wallet wallet = new Wallet(lines);
        try {
            FileReader fn = new FileReader("info.txt");
            Scanner scanner = new Scanner(fn);
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                //System.out.println(line);
                String[] parts = line.split(" ");
                //System.out.println(parts[0]);
                //System.out.println(parts[1]);
                //System.out.println(parts[2]);
                if(parts[0].equals(st1))
                {
                    String state =parts[3];
                    //System.out.println(state);
                    boolean auto = false;
                    int val = Integer.parseInt(parts[1]);
                    if(parts[2].equals("autographed"))
                        auto=true;
                    //System.out.println(auto);
                    wallet.addpapermoney(val,state,auto);
                }
                else if(parts[0].equals(st2))
                {
                    boolean gold = false;
                    int val = Integer.parseInt(parts[1]);
                    if(parts[2].equals("gold"))
                        gold=true;
                    wallet.addcoinmoney(val,gold);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found.");
        }


        wallet.printsummery();
        wallet.printtotalvalue();

    }

    }

