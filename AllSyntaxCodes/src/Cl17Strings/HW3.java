package Cl17Strings;

public class HW3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
    */
    private String findVowel(){
        return "I love java".replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        HW3 vowel=new HW3();
        System.out.println(vowel.findVowel().toLowerCase());
    }}
