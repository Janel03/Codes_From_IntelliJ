package ifElse;

import java.util.Scanner;
public class VowelConsonant {
    /*Write a program that prompts the user for a letter and then prints "vowel"
    if the input is a vowel (i.e. a, e, i, o, or u) and "consonant" otherwise*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //prompt the user for a letter
        System.out.println("Enter a letter: ");
        String letter=input.nextLine();
        //check if the letter is a vowel
        if (letter.equalsIgnoreCase("a")||
            letter.equalsIgnoreCase("e")||
            letter.equalsIgnoreCase("o")||
            letter.equalsIgnoreCase("i")||
            letter.equalsIgnoreCase("u")){
            System.out.println("The letter you have entered is a Vowel");

        } else{
            System.out.println("The letter you have entered is a Consonant");
        }}}
