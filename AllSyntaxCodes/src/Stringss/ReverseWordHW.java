package Stringss;

public class ReverseWordHW {
    public static void main(String[] args) {
        String name1 = "Hello world";
        char[] array = name1.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverse += array[i];

        }
        System.out.println(reverse);
    // another way
        String str="reversed word";
        String[] letters = str.split("");
        for (int c = letters.length - 1; c >= 0; c--) {
            System.out.print(letters[c]);

            //another way
            String a="reversed word";
            char [] b=a.toCharArray();

            for (int i=b.length-1; i>=0; i--){
                System.out.print(b[i]);
            }

        }
    }
}

