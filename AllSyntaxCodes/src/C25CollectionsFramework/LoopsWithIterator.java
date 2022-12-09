package C25CollectionsFramework;

import java.util.ArrayList;

public class LoopsWithIterator {
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

        //never use loops with Collections Framework classes
        /*for (int i = 0; i < beautyProd.size(); i++) {//for loop won't remove all, don't use loop or enhanced loop with ArrayList, AL will adjust its size
            if (beautyProd.get(i).endsWith("r")){
                beautyProd.remove(i);
            }
        }*/


    }
}
