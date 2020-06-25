package lab4;

public class Coin extends Money{
    
    public Coin( int value, String type){
 
        property = type;
        if(type.equals("gold")){
            this.value = value + 20;
        }
        else this.value = value;
    }
    public int getTrueValue(){
       return value;
    }

    
}
