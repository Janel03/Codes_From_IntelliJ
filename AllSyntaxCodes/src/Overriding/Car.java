package Overriding;
public class Car {
    void start(){
        System.out.println("use the key to start");
    }
    void stop(){
        System.out.println("use brakes to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }}
class BMW extends Car{
    void start(){
        System.out.println("use push to start");
    }
}
class Toyota extends Car{

}

