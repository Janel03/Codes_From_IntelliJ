import java.util.Scanner;
import java.util.Stack;

public class Repl99 {
    public static void main(String[] args) {
        String str, rev = "";

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        Boolean isReversed = false;
        //write your code below
        Stack stack = new Stack();

        for (int i = 0; i < givenString.length(); i++) {
            stack.push(givenString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (givenString.equals(isReversed)) {
            isReversed = true;
        }

        System.out.println(isReversed);
    }

    }



