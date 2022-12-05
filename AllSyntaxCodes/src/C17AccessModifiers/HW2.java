package C17AccessModifiers;

public class HW2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
    */
    public String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        HW2 str=new HW2();
        System.out.println(str.reverseWord("I love JAVA"));
    }}



