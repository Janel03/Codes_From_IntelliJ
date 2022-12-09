package C27CollectionsFramewors;

import java.util.HashMap;
import java.util.Iterator;

public class GetAllKeysNremove {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Banana",12.0);
        fruit.put("Orange",11.0);

        var allKeys=fruit.keySet();//print all the items
        System.out.println(allKeys);

        Iterator<String> iterator=allKeys.iterator();
        while (iterator.hasNext()){
            String item= iterator.next();
            if (item.contains("n")){//remove items with 'n' char
                iterator.remove();
            }}
        //shorter way with lambda
        fruit.keySet().removeIf(removeThis->removeThis.contains("n"));

        System.out.println(fruit);
    }
}
