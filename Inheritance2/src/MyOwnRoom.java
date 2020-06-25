import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyOwnRoom {
    public static void main(String[] args)
    {
        double area=2000;
        double carea=0;
        double rarea = 0;
        double sarea = 0;
        double tarea = 0;
        double[] a = new double[5];
        int c=0;
        Shape[] shapes= new Shape[5];
        try {
            FileReader fn = new FileReader("shapes.txt");
            Scanner sc = new Scanner(fn);
            while (sc.hasNextLine())
            {

                String line = sc.nextLine();
                String[] parts = line.split(" ");
                if(parts[0].equals("Circle"))
                {
                    boolean filled = false;
                    String color = parts[1];
                    String fill = parts[2];
                    if(fill.equals("True"))
                    {
                        filled= true;
                    }
                    String r = parts[3];
                    double rad = Double.parseDouble(r);
                    int i = c++;
                    shapes[i] = new Circle(color,filled,rad);
                    if(filled) {
                        a[i] = ((Circle) (shapes[i])).getarea();
                        carea += a[i];
                        tarea += a[i];
                    }
                    else {
                        a[i]=0;
                        carea += a[i];
                        tarea += a[i];
                    }
                }
                else if (parts[0].equals("Rectangle"))
                {
                    boolean filled = false;
                    String color = parts[1];
                    String fill = parts[2];
                    if(fill.equals("True"))
                    {
                        filled= true;
                    }

                    double width = Double.parseDouble(parts[3]);
                    double length = Double.parseDouble(parts[4]);
                    int i = c++;
                    shapes[i] = new Rectangle(color,filled,width,length);
                    if(filled) {
                        a[i] = ((Rectangle) (shapes[i])).getarea();
                        rarea += a[i];
                        tarea += a[i];
                    }
                    else {
                        a[i]=0;
                        rarea += a[i];
                        tarea += a[i];
                    }
                }
                else if (parts[0].equals("Square"))
                {
                    boolean filled = false;
                    String color = parts[1];
                    String fill = parts[2];
                    if(fill.equals("True"))
                    {
                        filled= true;
                    }

                    double side = Double.parseDouble(parts[3]);
                    int i = c++;
                    shapes[i] = new Square(color,filled,side);
                    if (filled) {
                        a[i] = ((Square) (shapes[i])).getarea();
                        sarea += a[i];
                        tarea += a[i];
                    }
                    else {
                        a[i]=0;
                        sarea += a[i];
                        tarea += a[i];
                    }
                }
            }
            System.out.println("Total Circle area " + carea);
            System.out.println("Total Rectangle area " + rarea);
            System.out.println("Total Square area " + sarea);
            System.out.println("Total area " + tarea);
            if(tarea>area)
            {
                for (int i=a.length-1; i>=0; i--)
                {
                    tarea=tarea-a[i];
                    if(tarea<=area)
                    {
                        System.out.println("Total area is greater than the Room area. So, the updated total area " + tarea);
                        break;
                    }
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("There is no such file.");
        }


    }
}
