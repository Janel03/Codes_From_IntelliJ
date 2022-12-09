package C27CollectionsFramewors;

import java.util.HashMap;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Banana",12.0);
        fruit.put("Banana",10.1);//replaces the other value > duplicates are not allowed
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));//will be confused

        Set<String> keySet=fruit.keySet();//will only give items=Keys, no duplicates
        System.out.println(keySet);

        var values=fruit.values();//will give all the values/prices
        System.out.println(values);


    }
}
