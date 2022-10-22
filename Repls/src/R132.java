import java.util.Scanner;

public class R132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digits = "123456789";
        String[] btm = { "1", "22", "333", "4444", "55555",
                "666666", "7777777", "88888888", "999999999" };
        System.out.println("Input an integer between 1 and 9");
        int input = scan.nextInt();
        if (input < 1 || input > 9) {
            System.err.printf("Invalid input: %d%n", input);
            System.exit(1);
        }
        for (int i = 0; i < input; i++) {
            System.out.println(digits.substring(0, i + 1));
        }
        for (int i = input - 1; i >= 0; i--) {
            System.out.println(btm[input - 1].substring(0, i + 1));
        }
}}




