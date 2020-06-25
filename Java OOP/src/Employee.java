import java.util.*;
public class Employee extends Person {
    private double salary;
    private int joinyear;
    private String inson;
    public Employee()
    {

    }
    public Employee( String name, double salary, int joinyear, String insno)
    {
        super(name);
        this.salary=salary;
        this.joinyear=joinyear;
        this.inson=insno;
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setJoinyear(int joinyear) {
        this.joinyear = joinyear;
    }

    public int getJoinyear() {
        return joinyear;
    }

    public void setInson(String inson) {
        this.inson = inson;
    }

    public String getInson() {
        return inson;
    }
    public boolean equals(String name)
    {
       return(name.equals(super.getName()));
    }
    public void update()
    {
        System.out.println("Type 1 to update salary, type 2 to update Insurance number and type 3 to leave.");
        Scanner sc =new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1)
        {
            System.out.println("Please type in new salary.");
            double sal = sc.nextDouble();
            setSalary(sal);
            return;
        }
        else if(option==2)
        {
            System.out.println("Please type in your new insurance number");
            String ins =sc.next();
            return;
        }

    }
    public Employee createaccount(String name,double salary,int year, String ins)
    {
        return new Employee(name,salary,year,ins);
    }
    public void print()
    {
        System.out.println(getName()+ " "+ getSalary() + " "+getJoinyear()+ " "+ getInson());
        return;
    }
}
