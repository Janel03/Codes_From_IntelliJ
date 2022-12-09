package ReviewMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        /*
        HashMap: doesn't retain the order. but it is the fastest
        LinkedHashMap: retains the order, but it is slower than HashSet
        TreesMap: to sort the data, but it's the slowest
         */
        Map<String,Double> veggieList=new LinkedHashMap<>();
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);

    }
}
