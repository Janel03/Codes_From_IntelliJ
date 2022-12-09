package C25CollectionsFramework;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class HW3RemoveNumsDividedBy5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        for (int i = 1; i < 500; i++) {
            if (i%5==0){
                nums.add(i);
            }
        }
        System.out.println(nums);





    }
}
