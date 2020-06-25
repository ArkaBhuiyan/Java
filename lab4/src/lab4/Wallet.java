package lab4;

public class Wallet {

    static int count = 0;
    Money element[] = new Money[100];

    public void PrintSummary() {

        int i = 1;

        while (i <= count) {
            if (element[i] instanceof RealPaper) {
                System.out.println("Object #" + i + " is an" + " authentic " + element[i].property + " " + element[i].value + " dollar bill" + " worth " + element[i].getTrueValue() + " dollars.");
            } else if (element[i] instanceof FakePaper) {
                System.out.println("Object #" + i + " is a" + " counterfeit " + element[i].property + " " + element[i].value + " dollar bill" + " worth " + element[i].getTrueValue() + " dollars.");
            } else {
                System.out.println("Object #" + i + " is a " + element[i].property + " " + element[i].value + " dollar coin" + " worth " + element[i].getTrueValue() + " dollars.");
            }

            i++;
        }
        System.out.println("Total " + CalculateTotal());

    }

    public void AddMoney(Paper m) {
        count++;
        element[count] = m;

    }

    public void AddMoney(Coin c) {
        count++;
        element[count] = c;

    }

    public int CalculateTotal() {
        int total = 0;
        int i = 1;
        while (i <= count) {
            //System.out.println(total + " + " + element[i].getTrueValue());
            total = total + element[i].getTrueValue();
            i++;
        }
        return total;
    }

}
