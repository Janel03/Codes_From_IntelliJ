package C27CollectionsFramewors;
import java.util.Collection;
import java.util.HashMap;
public class HashMapReturnKeysNValuesPrintValueOf1Key {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        fruit.put("Banana",12.0);
        System.out.println(fruit);//print all
        System.out.println(fruit.get("Banana"));//print value of Banana
        //returns all the keys in the form of Set
        Collection<String> keySet=fruit.keySet();
        System.out.println(keySet);
        // returns all the values in the form of a collection
        Collection<Double> values=fruit.values();
        System.out.println(values);
    }}

