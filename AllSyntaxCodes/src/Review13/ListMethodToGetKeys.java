package Review13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMethodToGetKeys {
    public static void main(String[] args) {
        //method that takes a map & returns an array containing all the keys from that map
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        ArrayList<String> keys=getKeys(items);
        for (var key:keys) {
            System.out.println(key);
        }}
    public static ArrayList<String> getKeys(Map<String, Double> map){
        return new ArrayList<>(map.keySet());
    }}

