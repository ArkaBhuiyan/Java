public class AgeOutOfRangeException extends Exception {
    int age;
    AgeOutOfRangeException(int age)
    {
        this.age=age;
    }
    public String toString()
    {
        return "You are older than the requested age(25 years), you are " + age + " old.";
    }
}
