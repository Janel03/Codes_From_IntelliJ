package PrivateClass;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] names={"adam","jon","don","karl"};
        String name="adam";

        for (String nam:names) {
            if (nam.equals("adam")){
                System.out.println("found");
            }
        }
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("adam");
        arrayList.add("janel");
        arrayList.add("rimma");
        arrayList.add("dusan");

        System.out.println(arrayList.contains("adam"));

    }
}
