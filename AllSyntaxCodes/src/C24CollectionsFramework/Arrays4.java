package C24CollectionsFramework;

import java.util.ArrayList;

public class Arrays4 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Janel");
        names.add("Luda");
        names.add("Rimma");

        names.add(2, "Josh again");//will add Josh
        names.set(2,"Josh again");//will replace Rimma
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(1,100);//move elements. this with 2 values is overloading
        System.out.println(numbers);
        numbers.clear();//deletes all the elements from the list
        System.out.println(numbers);
    }
}
