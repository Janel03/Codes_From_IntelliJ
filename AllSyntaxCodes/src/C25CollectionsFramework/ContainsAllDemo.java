package C25CollectionsFramework;

import java.util.ArrayList;

public class ContainsAllDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProd =new ArrayList<>();
        beautyProd.add("Blush");
        beautyProd.add("concealer");
        beautyProd.add("foundation");
        beautyProd.add("mascara");
        beautyProd.add("lipstick");
        beautyProd.add("foundation");
        beautyProd.add("eyeshadow");
        beautyProd.add("shampoo");
        beautyProd.add("lotion");
        beautyProd.add("moisturizer");
        beautyProd.add("conditioner");

        /*System.out.println(beautyProd.contains("Lipstick"));
        System.out.println(beautyProd.contains("eyeshadow"));
        System.out.println(beautyProd.contains("eyeliner"));*/

        //to check if things are in list > shorter way, than the one above

        ArrayList<String> bodyCare=new ArrayList<>();
        bodyCare.add("shampoo");
        bodyCare.add("lotion");
        bodyCare.add("moisturizer");
        bodyCare.add("conditioner");

        System.out.println(beautyProd.containsAll(bodyCare));


    }
}
