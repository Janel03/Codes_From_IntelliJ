package C25CollectionsFramework;

import java.util.ArrayList;

public class IteratorRemoveChars {
    public static void main(String[] args) {
        //delete all items with letter B or ends with a
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

        var iterator = beautyProd.iterator();//if you don't know what data type you're working with
        while (iterator.hasNext()){
            var item=iterator.next();
            if (item.startsWith("B")||item.endsWith("a")){
                iterator.remove();
            }}
        System.out.println(beautyProd);

        /*
           var iterator=beautyProducts.iterator();

        while(iterator.hasNext()){
            var item=iterator.next();
            if(item.startsWith("B") || item.endsWith("a")){
                iterator.remove();
            } THIS IS AN EASIER WAY > Lambda method
        }
        System.out.println(beautyProducts);
    }
         */

        //names.removeIf(item -> item.endsWith("r")); //> another easier way

        /*var number=10;
        var name="Janel";
        var decimalNum=21.5;*/


    }
}
