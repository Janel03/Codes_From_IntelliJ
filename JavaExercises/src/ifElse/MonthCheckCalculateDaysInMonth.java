package ifElse;
import java.util.Scanner;
public class MonthCheckCalculateDaysInMonth {
    /*Write a program that prompts the user for a month (as an integer) and then prints the number
of days in that month. Be sure to account for leap years!*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a month
        System.out.print("Enter a month (as an integer): ");
        int month = input.nextInt();

        // Print the number of days in the month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days");
        } else {
            System.out.println("Invalid month");
        }
    }
    }

