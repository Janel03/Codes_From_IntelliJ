package C25CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class HW2ReplaceWithAnotherStringIfContainsChar {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("juice");
        drinks.add("tea");

        Iterator<String> iterator= drinks.iterator();

        while (iterator.hasNext()){
            String beverage= iterator.next();
            if (beverage.contains("a")||beverage.contains("e")){
                System.out.println("Water");
            }else {
                System.out.println(beverage);
            }
        }

    }
}
