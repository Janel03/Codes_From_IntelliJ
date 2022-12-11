package ifElse;

import java.util.Scanner;
public class MultipleChecker {
    /* Write a program that prompts the user for two integers and then prints "multiple"
if the first number is a multiple of the second, and "not a multiple" otherwise*/
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            // Check if the first number is a multiple of the second
            if (num1 % num2 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("not a multiple");
            }
        }
    }


