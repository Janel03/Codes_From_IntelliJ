package C24CollectionsFramework;

import java.util.ArrayList;

public class ArrayListRemoveDelete {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println(colors);
        colors.remove("Blue");//remove > removes one by one, clear deletes everything
        colors.remove(2);//also can remove by index
        System.out.println(colors);
    }
}
