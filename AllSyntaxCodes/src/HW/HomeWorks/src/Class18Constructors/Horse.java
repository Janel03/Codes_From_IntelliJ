package Class18Constructors;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weight){//create a constructor
    this.name=name;
    this.breed=breed;
    this.age=age;
    this.weight=weight;
    }
    void  printInfo(){//create method
        System.out.println("name: "+this.name+" breed: "+this.breed+" age: "+this.age+" weight: "+this.weight);
    }
    public static void main(String[] args) {
        Horse horseObj=new Horse("Chestnut", "stallion", 20,400);//create object
        horseObj.printInfo();
    }}
