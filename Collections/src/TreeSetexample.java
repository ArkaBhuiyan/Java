import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable <Book>
{
    int id;
    String writer;
    String title;
    int page;
    Book(int id, String title, String writer, int page )
    {
        this.id= id;
        this.title= title;
        this. writer= writer;
        this.page= page;
    }

    @Override
    public int compareTo(Book b) {
        if(id>b.id)
        {
            return 1;
        }
        else if(id<b.id){
            return -1;
        }
        else
            return 0;
    }
}
public class TreeSetexample {
    public static void main(String args[])
    {
        TreeSet<Book> set= new TreeSet<Book>();
        Book b1= new Book(101, "Amar Bondhu Rashed", "Jafor Iqbal", 201);
        Book b2 = new Book(102, "Himu Mama", "Humayun Ahmed", 180);
        Book b3 = new Book(103, "Abishkerer neshai", "Abdullah Al Muti", 200);
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //Iterator i = set.iterator();
        for (Book b:set)
        {
            System.out.println(b.id + " " + b.title + " " + b.writer + " " + b.page);
        }
    }

    


}
