package Class18Constructors;

public class Car{//parent class
    // should be one public class & match the name of file
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    void printCarDetails(){
        System.out.println("Model: "+model+" Make: "+make+" Color: "+color);
    }}
class bmw extends Car{//add extends to glue with parent class
    double engineCC;
    }
    class Tesla extends Car{
}
class Toyota extends Car {
    double engineCC;
}
class CarTester{
    public static void main(String[] args) {
        bmw bmw=new bmw();
        bmw.model="X5M";
        bmw.make="BMW";
        bmw.color="White";
        bmw.printCarDetails();
    }}
