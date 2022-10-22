package Stringss;

public class Main {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(deleteFirstHalf(s));
        System.out.println(deleteSecondHalf(s));


    }
    private static String deleteFirstHalf(String s){
        return s.substring(s.length()/2) ;
    }
    private static  String deleteSecondHalf(String s){
        return s.substring(0,s.length()/2) ;
    }}