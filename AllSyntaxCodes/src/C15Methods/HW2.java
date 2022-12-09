package C15Methods;

public class HW2 {
     /*
    /Create a method that will take a number and prints whether the number is even or odd./
     */

    void printEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+" is Odd");
        }
    }

    public static void main(String[] args) {
        HW2 task=new HW2();
        task.printEvenOdd(45);
        task.printEvenOdd(50);

    }
}
