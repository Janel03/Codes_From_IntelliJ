package PrivateClass;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("(()"));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("(()))"));
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced(")()("));
    }
    public static boolean isBalanced(String s){
        char[] arr=s.toCharArray();
        int opening = 0;
        int closing = 0;
        for (char c : arr) {
            if (c == '(') {
                opening++;
            } else if(c==')'){
                closing++;
            }}
        System.out.println(opening);
        System.out.println(closing);
        if (opening==closing){
            return true;
        }
        else {
            return false;
        }}}









