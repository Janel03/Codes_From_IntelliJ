


import java.util.Scanner;

public class Repl103 {
    public static void main(String[] args) {
        //Repl 103 Write a for loop that will print out
        // each letter of the string s,
        // separated by spaces, on the same line.

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+" ");
        }
        }
    }


