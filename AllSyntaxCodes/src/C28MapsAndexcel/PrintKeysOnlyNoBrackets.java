package C28MapsAndexcel;
import java.util.HashMap;
import java.util.Set;
//Demo 3 print all the Keys without a bracket
public class PrintKeysOnlyNoBrackets {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        //keySet method returns a Set that contains all the keys of map
        Set<String>keys=items.keySet();
        // Collection<String> keys2 =items.keySet(); >another way
        for (String key:keys){
            System.out.println(key);
        }}}