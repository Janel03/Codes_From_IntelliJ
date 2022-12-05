package C11Object;

public class Dog {
    // State or attribute or properties or fields
    String name;
    String color;
    String breed;
    double weight;
    int age;
    // next is behavior

    void bark() {
        System.out.println(name+"Barking...");
    }
    void sleep() {
        System.out.println(breed+" is sleeping");
    }
    public static void main(String[]args) {
        //creates object from class
        //new Dog()creates an object of class Dog
        Dog Husky=new Dog();
        Husky.name="Deezl";
        Husky.age=5;
        Husky.color="gray";
        Husky.breed="Husky";

        System.out.println("I have a "+Husky.breed+". His name is "+Husky.name
        +", he is "+Husky.age+" and his fur is "+Husky.color+".");
    }
}

