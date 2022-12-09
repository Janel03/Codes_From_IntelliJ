import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  JUST EXAMPLE
public class R221 {
    public static void main(String[] args) {

        System.out.println(findMaxLenEven("find MaxLen Even"));
        System.out.println(findMaxLenEven("I am very Good at Java"));
        System.out.println(findMaxLenEven("I was"));
    }
    public static String findMaxLenEven(String str) {
      /*  String result="";
        String arr[]=str.split("\\s");

        for(String a:arr){
            result=(a.length()>result.length()&&a.length()%2==0)?a:result;
        }

        if(result.length()==0){
            return "-1";
        }else{
            return result;
        }}}*/
        String input = "";
        String[] input_words = str.split(" ");
        String longestWord = " ";

        for (String word : input_words) {
            Pattern p = Pattern.compile("^[a-zA-Z]+");
            Matcher m = p.matcher(word);
            m.find();
            if (m.group().length() % 2 == 0 && m.group().length() > longestWord.length()) {
                longestWord = m.group();
            }}
        return longestWord;
    }}