package Stringss;

import java.util.Arrays;
public class PrintStringInCharContChars {


        public static void main(String[] args) {

            String str="I love java programming";
            /*
             * toCharArray will convert a String to an array of chars
             */
            char[] charArray=str.toCharArray();

            System.out.println(Arrays.toString(charArray));
            System.out.println(charArray[7]);

            int counter=0;
            for(char c:charArray) {

                if(c=='a') {
                    counter++;
                }
            }
            System.out.println("letter a has appread "+counter+" times");

        }

    public static class SplitStrings {

        public static void main(String[] args) {




            String str="Batch 14 is really good";
            String [] arr=str.split(" ");
            System.out.println(Arrays.toString(arr));
            System.out.println(arr[4]);

            String str2="Today is Sunday. Sunday is good. Java is also good";
            String[] arr2=str2.split("[.]");
            System.out.println(arr2);
        }

    }

    public static class PrintMiddleLetterNum {
        public static void main(String[] args) {
            String str="hello";

            int length=str.length();

            if(!str.isEmpty()&&length%2!=0&&length>=3) {

                int middleIndex=length/2;
                System.out.println(str.charAt(middleIndex));
            }
        }

    }
}

