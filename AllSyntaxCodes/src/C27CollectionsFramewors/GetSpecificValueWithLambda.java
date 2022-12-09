package C27CollectionsFramewors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class GetSpecificValueWithLambda {
    public static void main(String[] args) {
            HashMap<String, Double> fruit=new HashMap<>();
            fruit.put("Apple",1.99);
            fruit.put("Mango",1.99);
            fruit.put("Banana",12.0);
            fruit.put("Orange",11.0);

            Collection<Double> values=fruit.values();//returns all the values from a map
        Iterator<Double> iterator=values.iterator();
        while (iterator.hasNext()){
            Double value= iterator.next();
            if (value>2){
                iterator.remove();
            }}
        System.out.println(fruit+"with WHILE LOOP");
//this is a shorter way to get the same as above > through lambda
        fruit.values().removeIf(removeThis->removeThis>2);
        System.out.println(fruit+" with LAMBDA");
    }}
