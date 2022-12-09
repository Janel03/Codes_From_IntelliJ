package C27CollectionsFramewors;

import java.util.ArrayList;

public class DogArray {
    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Tommy","Black","German Shepard"));
        dogs.add(new Dog("Jonny","White","Bulldog"));
        dogs.add(new Dog("Kimi","Brown","Chihuahua"));

        Dog dog=new Dog("Tommy","Black","German Shepard");
        //System.out.println(dog.toString());//will print one dog
        System.out.println(dogs);//prints all the dogs
    }}
