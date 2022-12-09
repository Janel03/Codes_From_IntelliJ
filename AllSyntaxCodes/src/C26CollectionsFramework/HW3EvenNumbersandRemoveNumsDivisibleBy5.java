package C26CollectionsFramework;

import java.util.ArrayList;
/* Create an arrayList of even numbers from 1 to 500.
Remove any number that is divisible by 5 from that arrayList.
  */
public class HW3EvenNumbersandRemoveNumsDivisibleBy5 {
    public static void main(String[] args) {
        ArrayList<Integer> even=new ArrayList<>();
        for (int i = 2; i <=500; i=i+2) {
            even.add(i);
        }
        System.out.println(even);

        var it=even.iterator();

        while (it.hasNext()){
            Integer num= it.next();
            if (num%5==0){
                it.remove();
            }}
        System.out.println(even);
    }}
