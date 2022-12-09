package C14StringMethods;

public class HW1 {
    public static void main(String[] args) {
        /*Create a String that will hold a sentence.
        Write a program to get a new String
        without any spaces*/

        String str="we love Java";
        str=str.replaceAll(" ","");
        System.out.println("str = " + str);
    }
}
