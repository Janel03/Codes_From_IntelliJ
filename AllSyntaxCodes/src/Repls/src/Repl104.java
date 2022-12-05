import java.util.Scanner;
public class Repl104 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        inp.close();

        int size=word.length();
        System.out.println(word.substring(size/2));

    }
}