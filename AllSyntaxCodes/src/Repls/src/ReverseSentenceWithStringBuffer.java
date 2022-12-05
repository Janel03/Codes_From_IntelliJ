import java.util.Scanner;

public class ReverseSentenceWithStringBuffer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value");
        String name = input.next();

        StringBuffer sbf = new StringBuffer("Hello Friends");


        // Here it reverses the string buffer
        sbf.reverse();
        System.out.println(sbf);
    }
}