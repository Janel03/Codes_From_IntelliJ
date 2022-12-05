import java.util.Scanner;

public class ReplNineSeven {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String input = sc.nextLine();

        while (input.equals("Chrome")){
            System.out.println("Proceed with "+input+" browser");

        }
    }
}
