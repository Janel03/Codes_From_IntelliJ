package ReviewSets;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArrayListAndSort {
    public static void main(String[] args) {
        //sort & remove duplicate from ArrayList
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(150000);
        numbers.add(180000);
        numbers.add(160000);
        numbers.add(140000);
        numbers.add(140000);

        Set<Integer> set=new TreeSet<>(numbers);//converts the ArrayList to a TreeSet
        System.out.println(set);//1st way
        /* numbers.clear(); 2nd way
        numbers.addAll(set);
        System.out.println(numbers);*/
        //3rd way
        ArrayList<Integer> numbers2=new ArrayList<>(set);
        System.out.println(numbers2);
    }
}
