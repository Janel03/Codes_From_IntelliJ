package Stringss;

public class ReverseString {
    public static void main(String[] args) {
        //how to reverse a String without reverse function
        //1. use StringBuilder & reverse method
        //2. use charAt();
        String str="hello";
        String newString = "";
        for (int i=str.length()-1; i>=0; i--){
            newString=newString+str.charAt(i);
            //if I add sysout will start incrementing from end over and over till starting point
            //System.out.println(newString);
        }
        String s="Class is almost over";
        StringBuilder sb=new StringBuilder(s);//create an object with new
        sb.reverse();
        System.out.println(sb);
        System.out.println("------------------------------");
        //HW to charArray();
        String myStr="Homework";
        char[] c=myStr.toCharArray();
        for (int i=c.length-1; i>=0; i--){
            System.out.print(c[i]+" ");
        }
    }
}
