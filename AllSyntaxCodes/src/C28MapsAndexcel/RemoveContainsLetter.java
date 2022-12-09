package C28MapsAndexcel;
import java.util.HashMap;
//Demo 2 > Remove items containing "e"
public class RemoveContainsLetter {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        //must have a collection 1st >keySet
        items.keySet().removeIf(name-> name.contains("e"));//lambda
        System.out.println(items);
    }}