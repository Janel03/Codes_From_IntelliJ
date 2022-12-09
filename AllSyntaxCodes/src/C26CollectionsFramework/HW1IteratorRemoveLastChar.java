package C26CollectionsFramework;

import java.util.ArrayList;
//Create an arrayList of words. Remove every word that ends with “e”.
public class HW1IteratorRemoveLastChar {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList();
        words.add("Java");
        words.add("Janelle");
        words.add("France");
        words.add("Luda");

        var iterator=words.iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            if (item.endsWith("e")){
                iterator.remove();
            }}
        System.out.println(words);
    }}
