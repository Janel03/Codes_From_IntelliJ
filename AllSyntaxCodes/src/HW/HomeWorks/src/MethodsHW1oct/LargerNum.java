package MethodsHW1oct;

public class LargerNum {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void largest (int a, int b){
        if (a>b){
            System.out.println("Larger number is = " + a);

        } else{
            System.out.println("Larger number is = " + b);
        }
    }

    public static void main(String[] args) {

        LargerNum num=new LargerNum();
        num.largest(35,45);

    }
}
