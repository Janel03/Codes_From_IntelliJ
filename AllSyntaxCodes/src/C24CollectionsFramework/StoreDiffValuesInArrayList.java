package C24CollectionsFramework;

import java.util.ArrayList;

public class StoreDiffValuesInArrayList {
    public static void main(String[] args) {
        //store chars
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(10.1F);
        floats.add(22.0F);
        floats.add(52.8F);
        floats.add(56.2F);
        System.out.println(floats);



    }
}
