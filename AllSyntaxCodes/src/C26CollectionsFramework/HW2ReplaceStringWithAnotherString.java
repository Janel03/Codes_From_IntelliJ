package C26CollectionsFramework;
import java.util.ArrayList;
/*
create an arraylist of drinks.if any drink has letter "a" or "e"
replace it with water.
 */
public class HW2ReplaceStringWithAnotherString {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("lemonade");
        drinks.add("tea");
        drinks.add("tequila");
        drinks.add("milk");
//better to use for loop, cause we are not changing the list
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }}
        System.out.println(drinks);
    }}


