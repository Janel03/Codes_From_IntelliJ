package C24Incapsulation;

public class Cat {
   private String name;
   private String breed;
   private int age;
   private double weight;
    public Cat(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        Cat cat=new Cat("Thunder", "Egyptian",8,30);
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
    }}


