import java.util.Scanner;
public class R125S {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        String[] arr = new String [scan.nextInt()];
        arrFiller(arr);

        for (String s : arr) {
            print(isBalanced(s));
        }
        scan.close();
    }
    public static boolean isBalanced(String s) {
        //if length of s is not even -> braces are not balanced by default
        if (s.length() % 2 != 0) return false;

        //here I split String s on two equal parts;
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        return bracketComparor(s1, s2);
    }

    public static void print(Boolean b) {
        System.out.println(b);
    }
    //here I checked s1 "((" and s2 "))", if s1 ='(',hence s2 =')' and wise versa, otherwise, braces are not balanced.
    public static boolean bracketComparor(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {

            //s1 starts from index 0 -> to end, s2 - starts from last index-> to first, both Strings move to 'center'.
            if (s1.charAt(i) == '(' && s2.charAt(s1.length() - i - 1) != ')') {
                return false;
            } else if (s1.charAt(i) == ')' && s2.charAt(s1.length() - i - 1) != '(') {
                return false;
            }}
        return true;
    }
    public static String []arrFiller(String []s){
        for(int i=0;i<s.length;i++){
            s[i]=scan.next();
        }
        return s;
    }

}

