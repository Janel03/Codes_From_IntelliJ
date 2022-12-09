package C25CollectionsFramework;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class HW1RemoveStringWithLastChar {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Janel");
        names.add("Luda");
        names.add("Rimma");
        names.add("Mike");
        names.add("Apple");

        var iterator=names.iterator();

        while (iterator.hasNext()){
            var name=iterator.next();
            if (name.endsWith("e")){
                iterator.remove();
            }}
        System.out.println(names);
    }}

