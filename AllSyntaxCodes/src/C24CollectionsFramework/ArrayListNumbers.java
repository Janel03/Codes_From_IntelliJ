package C24CollectionsFramework;

import java.util.ArrayList;

public class ArrayListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);

        for (Integer num:numbers){
            System.out.println(num);
        }
    }
}
