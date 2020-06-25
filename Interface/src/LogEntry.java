import java.time.LocalDate;
public class LogEntry {
    public LocalDate timestamp;
     public String itemname;
     public String soldbought;
     public int items;
     LogEntry()
     {
         this.timestamp=null;
         this.itemname="";
         this.soldbought="";
         this.items=0;
     }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setSoldbought(String soldbought) {
        this.soldbought = soldbought;
    }

    public void setItems(int items) {
        this.items = items;
    }
    public String tostring()
    {
        String str= timestamp + " " + itemname+ " " + soldbought + " " + items;
        return str;
    }
}
