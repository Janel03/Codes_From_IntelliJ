public class R172 {

}
class Main2 extends Parent{
    public static void main(String[] args) {
        Main2 print=new Main2();
        print.m1();
        print.m2();
    }

    void m1(){
        System.out.println("Child class providing implementation");
    }}
abstract class Parent{
    abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }}

