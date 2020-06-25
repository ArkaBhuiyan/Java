package lab4;

public class Paper extends  Money{
    
    public Paper(int val, String property){
        value = val;
        this.property = property;
        if(property.equals("autographed")){
            value = value+10;
        }
    }
    public String getType(){
        return "Paper";
    }
    public int getTrueValue(){
      return value;
    }
    
}
