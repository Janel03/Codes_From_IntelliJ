package Stringss;

public class CombineNoSpaceNoWhitespaceChop {
    public static void main(String[] args) {
        //#7 trim(); removes spaces before & after the String
        //text from a website
        String textFromApplication="  Enroll today  ";//text with whitespaces
        String textFromUserStory="Enroll Today";

        if (textFromApplication.trim().equals(textFromUserStory)){
            System.out.println("Text is matched. Test Pass");
        }else {
            System.out.println("Text is NOT matched. Test Failed");
        }
        System.out.println(textFromApplication.trim());//without whitespaces
        System.out.println(textFromApplication);

        //#8 substring = to print specific words in sentence=count from beginning of index=word you want to print
        String str="Hello Class";
        String part2=str.substring(6);   //print Class
        System.out.println(part2);
        //print Hello
        String part1=str.substring(0,5);
        System.out.println(part1);
        //combine both strings
        String wholeString=part1.concat(part2);
        //String wholeString=part1.concat("").concat(part2); with space

        System.out.println(wholeString);
        //or use +
        System.out.println(part1+part2);

        //with char= print char of the number given ()
        char part3=wholeString.substring(6).charAt(0);
        System.out.println(part3);

        //wholeString.charAt(0).substring(6); compiler error=cause it's a char value already, substring won't work, not a string anymore

    }
}
