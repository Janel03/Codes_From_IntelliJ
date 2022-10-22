package StringMethodHW;

public class ReverseMirror {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String a = "any sentence";
        String[] arr = a.split(" ");
// reverse each character
        for (int k = 0; k < arr.length; k++) {
            for (int m = arr[k].length() - 1; m >= 0; m--) {
                System.out.print(arr[k].charAt(m));
            }
            System.out.print(" ");
            /*
        String letter="This is sentence I want to reverse";
        StringBuilder str=new StringBuilder(letter);
        System.out.println(str.reverse());*/
        }

    }
}


