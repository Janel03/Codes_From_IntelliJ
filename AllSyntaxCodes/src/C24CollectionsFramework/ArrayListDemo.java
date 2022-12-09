package C24CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*String[] names={"Janel", "Rimma", "Puskar"};//for multiple values of same kind, for single use variables
        //cons> arrays are fixed in size

        java.util.ArrayList<String> colors=new java.util.ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);*/
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println(colors);

        System.out.println(colors.get(0));//to get specific value
        System.out.println(colors.get(2));
        System.out.println(colors.size());//will print number of colors

        for (int i = 0; i <colors.size();i++){
            System.out.println(colors.get(i));
    }
        for (String color:colors)
            System.out.println(color);}
}