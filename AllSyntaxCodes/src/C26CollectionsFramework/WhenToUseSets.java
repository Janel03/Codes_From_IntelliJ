package C26CollectionsFramework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//use Sets to remove Duplicates
public class WhenToUseSets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        //print all the numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        System.out.println(numbers);
        //CONVERT TO LinkedHashSet & print NO DUPLICATES IN ORDER
        System.out.println(new LinkedHashSet<>(numbers)+"REMOVE DUPLICATES IN ORDER");
        //CONVERT TO HashSet & print NO DUPLICATES
        HashSet<Integer> hashSet=new HashSet<>(numbers);
        System.out.println(hashSet);
        //CONVERT TO LinkedList & print NO DUPLICATES
        LinkedList<Integer> linkedList=new LinkedList<>(hashSet);
        System.out.println(linkedList);
    }}

