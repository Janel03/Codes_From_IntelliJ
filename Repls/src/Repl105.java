import java.util.Scanner;

public class Repl105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i = 0; i < word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
                System.out.print(word.charAt(i));
            }

        }
    }
}