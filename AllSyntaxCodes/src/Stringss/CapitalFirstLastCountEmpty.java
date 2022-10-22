package Stringss;

public class CapitalFirstLastCountEmpty {
    public static void main(String[] args) {

        String str="KudaigaShukir";
        //#1 toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str); //hello

        str=str.toUpperCase();
        System.out.println(str); //HELLO

        //#2 length > gives size= returns the length of this string
        int size=str.length();
        System.out.println(size);

        //#3 charAt > returns the char value=num at the specified index
        char letter=str.charAt(0);
        System.out.println(letter);

        //#4 how to get the last character, if string is too long
        char lastChar=str.charAt(str.length()-1);
        System.out.println(lastChar);

        //#5 indexOf > gives num of characters/letters
        int index=str.indexOf(lastChar);
        System.out.println(index);

        System.out.println(str.indexOf('s')); //-1, cause word doesn't have S

        //#6isEmpty > tells if the word is empty/exists or not
        boolean empty=str.isEmpty();
        System.out.println(empty);

    }
}
