package ReviewLists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReplaceElementBiggerThan4Letters {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        //System.out.println(animals);print all

        /*if element is more than 4 letter replace with Camel
        don't use iterator,because we are not performing any operation
        that can change the size of the list
        Don't use enhanced for loop, as we are not printing the data, we are printing the data.
        Since we need an index to update the data, use simple for loop*/
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length()>4) {
                animals.set(i, "Camel");//set method replace the elements
            }
        }
        System.out.println(animals);

        System.out.println(animals.subList(0,3));

        ListIterator<String> stringListIterator=animals.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
    }
}
