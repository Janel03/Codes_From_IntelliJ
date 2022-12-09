package C25CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList<String> beautyProd =new ArrayList<>();
        beautyProd.add("Blush");
        beautyProd.add("concealer");
        beautyProd.add("foundation");
        beautyProd.add("foundation");
        beautyProd.add("eyeshadow");
        beautyProd.add("shampoo");
        beautyProd.add("lotion");
        beautyProd.add("mascara");
        beautyProd.add("lipstick");
        beautyProd.add("moisturizer");
        beautyProd.add("conditioner");

        Iterator<String> iterator=beautyProd.iterator();
        System.out.println(beautyProd.size());//will print count of items
//to remove items from AL while loop is best for hasNext
        while (iterator.hasNext()){
            String item= iterator.next();
            if (item.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProd);
    }
}
