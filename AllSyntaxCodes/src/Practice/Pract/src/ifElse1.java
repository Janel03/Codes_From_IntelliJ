import java.util.Scanner;
public class ifElse1 {
    public static void main(String[] args) {
        /*1. Write a program that prompts the user for an integer and then prints "positive"
        if the number is greater than zero, "negative" if the number is less than zero,
        and "zero" if the number is equal to zero.
3. Write a program that prompts the user for two integers and then prints "multiple"
if the first number is a multiple of the second, and "not a multiple" otherwise.
4. Write a program that prompts the user for a month (as an integer) and then prints the number
of days in that month. Be sure to account for leap years!
5. Write a program that prompts the user for a year and then prints whether or
not the year is a leap year. A year is a leap year if it is divisible by 4,
unless it is also divisible by 100 and not 400.*/

        Scanner input = new Scanner(System.in);

        System.out.printf("Please input a number");
        int num = input.nextInt();

        if(num>0)
            System.out.printf("Positive");

        if (num<0)
            System.out.printf("Negative");
        if (num==0)
            System.out.printf("Zero");
    }
}
