package Stringss;

public class PrintSpecificLetterPrintCharsNoSpace {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str="I love java programming";
        /*
         * charAt returns us the character at a specific index
         */
        System.out.println(str.charAt(3));
        System.out.println("____________________________________________");

        for(int i=0; i<str.length();i++) {
            //print only the characters not spaces
            if(!(str.charAt(i)==' ')) {
                System.out.println(str.charAt(i));
            }

        }
    }

    public static class PrintReverse {
        public static void main(String[] args) {
            /*
             * Create a String and print it in reverse order (Sunday → yadnuS).
             */
            String str1="Monday";
            for(int i=str1.length()-1; i>=0; i--) {
                System.out.print(str1.charAt(i));
            }

            System.out.println("--------------------------------------------------");

            char [] charArr=str1.toCharArray();
            for(int i=charArr.length-1; i>=0; i--) {
                System.out.print(charArr[i]);
            }

        }

    }
}


