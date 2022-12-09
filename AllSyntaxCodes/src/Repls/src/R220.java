public class R220 {
    public static void main(String[] args) {
        System.out.print(formatString("00-44  #$% 48 55"));
    }
    public static String formatString(String S){
        String format="";
        String newFormat = "";
        var j=3;
        String newWord = S.replaceAll("[^0-9]","");
        var length = newWord.length();
        for(int i=0;i<length;i+=3)
            if (j < length) {
                newFormat = newWord.substring(i, j);
                format += newFormat + "-";
                j += 3;
            } else {
                format += newWord.substring(i, length);
            }
        return format;
    }}




        //JUST EXAMPLE
       /* String input = "004448555555";

        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1 $2-$3");

        System.out.println(number);
    }
    }*/