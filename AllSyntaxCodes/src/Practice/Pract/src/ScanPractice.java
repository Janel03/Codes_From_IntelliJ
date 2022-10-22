import java.util.Scanner;

public class ScanPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//call the scanner
        System.out.println("Type something");//leave instructions for user
        String message=scan.nextLine();//tell scanner to scan the user's message
        System.out.println(message);//repeat back the user's message

    }
}
