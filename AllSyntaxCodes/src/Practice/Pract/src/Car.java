public class Car {
    String make;
    String model;
    int numDoors;
    int topSpeed;
    double price;

    Car(String make,String model,int numDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numDoors=numDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;
        numDoors=4;
    }
}
