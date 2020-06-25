import java.util.Scanner;

public class numbers {
    public static void main(String args[])
    {
        boolean state = true;
        while(state) {
            int r;
            Randomint rand = new Randomint();
           // Thread t = new Thread(rand);
            //t.start();
            r = rand.randint();

            try {
                rand.t.join();

            }
            catch (InterruptedException e)
            {
                System.out.println("Random number generation thread interrupted.");
            }


            if(r%2==0)
            {
                Square sq = new Square(r);
                sq.t.start();
                try {
                    sq.t.join();
                }
                catch (InterruptedException e)
                {
                    System.out.println("Interrupted square thread.");
                }
            }
            else {
                Cube cu = new Cube(r);
                cu.t.start();
                try{
                    cu.t.join();
                }
                catch (InterruptedException e)
                {
                    System.out.println("Interrupted cube thread;");
                }
            }
            System.out.println("repeat process?");
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            if(st.equals("no"))
                state=false;

        }
    }
}
