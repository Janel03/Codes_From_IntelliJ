package C28MapsAndexcel;//MapsDemo
import java.util.HashMap;
public class RemoveBasedOnValues {
    public static void main(String[] args) {
        //Remove the items if their price is more than 10
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
      /*  //first we are getting a collection of values then an Iterator
           Iterator<Double> iterator=items.values().iterator();
           //first we are getting a collection of values then an Iterator
        while (iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }}*/
        //with Lambda
        items.values().removeIf(price -> price>10);
        //items.values().removeIf(price -> price>10&&price<100);
        System.out.println(items);
    }
    /*public boolean check(Double price){
        if (price > 10) {
            return true;
        } else {
            return false;
        }}*/}
