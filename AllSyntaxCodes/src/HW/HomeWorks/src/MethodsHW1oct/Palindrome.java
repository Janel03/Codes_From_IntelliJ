package MethodsHW1oct;

public class Palindrome {
    public static void main(String[] args) {
        //Create a method that will print whether given String is palindrome or not.

        String pal = "ata";
        StringBuilder stringBuilder = new StringBuilder(pal);
        stringBuilder.reverse();

        if (stringBuilder.toString().
                equals(pal)) {
            System.out.println("The string is palindrome");

        } else {
            System.out.println("The string is not palindrome");
        }}}

