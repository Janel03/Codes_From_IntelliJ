package C27CollectionsFramewors;

import java.util.LinkedHashMap;
public class PrintAllnClear {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> beautyProducts=new LinkedHashMap<>();
        beautyProducts.put("Foundation",50.5);
        beautyProducts.put("Blush", 20.0);
        beautyProducts.put("Lipstick", 10.50);

        LinkedHashMap<String, Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("Conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String, Double> grocery=new LinkedHashMap<>();
        //will print beauty IN ORDER WITH PRICES
        grocery.putAll(beautyProducts);
        System.out.println(grocery);
        //will print everything Cosm & Beauty
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        //clear everything from the List
        grocery.clear();
        System.out.println(grocery);
    }}
