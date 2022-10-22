package Stringss;

public class ReplaceCharsStrings {
    public static void main(String[] args) {
        //replace();=can replace any string or single character/word
        String myString="Today is September";
        myString.replace("September","October");//no output, need to reassign
        myString=myString.replace("September","October");
        System.out.println(myString);

        myString=myString.replace('T','t');//replace specific characters/letters
        System.out.println(myString);
        //ignoreCase (is a boolean value)
        //myString.equalsIgnoreCase("Today is october").replace('a','i'); won't work, needs boolean

        //split(); returns array [] of strings, prints count of words=5
        String myStr="Today is a great class!";//means 5 strings, stored in arrays as each string in []
        String[] array=myStr.split(" ");
        System.out.println(array.length);//prints nums of words
        System.out.println(array[3]);//to print one exact word from string
        System.out.println("----------------------------------------------");
        //to print all, to cut the string
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            //other way=enhanced for loop
            for (String arr:array){
                System.out.println(arr);
            }
        }
    }
}
