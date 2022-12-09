package C25CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNextHasNextPrintNewLine {
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
//get the iterator from list
        Iterator<String> iterator=beautyProd.iterator();
        System.out.println(iterator.hasNext());//we have 1 item (if I comment out the rest of the list)
        System.out.println(iterator.next());//it gives the item & removes the items from iterator
        System.out.println(iterator.hasNext());//false, cause there's only 1 item, there's nothing after next > so, no hasNext
        iterator.next();
        iterator.next();//true
        System.out.println(iterator.next());//foundation, prints foundation cause called next twice

    }
}
