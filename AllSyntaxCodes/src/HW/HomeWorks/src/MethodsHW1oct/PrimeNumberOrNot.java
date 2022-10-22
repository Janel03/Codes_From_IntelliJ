package MethodsHW1oct;

public class PrimeNumberOrNot {
   //#6  Write a method to return whether given number is prime or not?
    void prime (int num){
        if (num%2==0 && num<=3){
            System.out.println(num+" is a prime number");

        }else {
            System.out.println(num+" is not a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumberOrNot num=new PrimeNumberOrNot();
        num.prime(100);
    }
}
