package MethodsHW1oct;

public class EvenOrOdd {
    //Create a method that will take a number and prints whether the number is even or odd.

    boolean evenOdd (int num){
        if (num%2==0){
            return true;

        } else {
            return false;
        }}

    public static void main(String[] args) {
        EvenOrOdd eo=new EvenOrOdd();
        if (eo.evenOdd(27)){
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
    }
}
