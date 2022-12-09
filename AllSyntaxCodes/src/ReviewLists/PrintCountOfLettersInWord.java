package ReviewLists;

import java.util.ArrayList;

public class PrintCountOfLettersInWord {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        System.out.println(animals);
//print the size of each word from this list
        for (String animal : animals) {//shortcut> type iter & it will give this code
            System.out.println(animal.length());
        }

        }
    }

