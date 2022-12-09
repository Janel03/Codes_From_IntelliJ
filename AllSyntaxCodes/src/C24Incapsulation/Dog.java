package C24Incapsulation;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;
    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }
    void setName(String name){
        if (name.length()>30){
            System.out.println("Name can not be more than 30 characters. Please try again.");
        }else if (name.isEmpty()){
            System.out.println("Name can not be empty. Please try again.");
        }else{
            this.name=name;
        }}
    void setAge(int age){
        if (age>20){
            System.out.println("Please use realistic dog age. Something is off here, are you sure it's a dog?");
        } else if (age<0) {
            System.out.println("Age can not be negative. Your dog is dead?");
        }else {
            this.age=age;
        }}
    void setBreed(String breed){
            if (breed.length()>20){
                System.out.println("Breed can not be more than 30 characters. Please try again.");
            } else if (breed.isEmpty()) {
                System.out.println("Breed can not be empty. Please try again.");
            }else {
                this.breed=breed;
            }}
    void setWeight(double weight){
        if (weight>300){
            System.out.println("Your dog is fat");
        } else if (weight<0) {
            System.out.println("is your dog alive?");
        }else {
            this.weight=weight;
        }}
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
    int getAge(){
        return age;
    }
    double getWeight(){
        return weight;
    }
    void  print(){
        System.out.println("Name: "+name+", Breed: "+breed+", Age: "+age+", Weight: "+weight);
    }}
class Test {
    public static void main(String[] args) {
        Dog tommy=new Dog("Tommy", "German",10,20);
        //tommy.age=1500; //they will be able to cheat like this & change the value, one way to protect> make age private
       /* tommy.name="Tommy";
        tommy.breed="German";
        tommy.age=15;
        tommy.weight=20;*/
       // System.out.println(tommy.name);//can not use it, cause it's private
        System.out.println(tommy.getName());//will print Tommy separately
        tommy.print();
    }
}
