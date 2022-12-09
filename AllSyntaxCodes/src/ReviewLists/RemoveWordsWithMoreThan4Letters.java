package ReviewLists;

import java.util.ArrayList;

public class RemoveWordsWithMoreThan4Letters {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        System.out.println(animals);

        //remove words that have more than 4 letters
        animals.removeIf(removeL->removeL.length()>4);
        System.out.println(animals);
    }
}