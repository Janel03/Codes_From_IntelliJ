package ReplsAI;

public class R215Ai2 {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())")); // should print true
        System.out.println(isBalanced("()")); // should print true
        System.out.println(isBalanced(")()(")); // should print true
        System.out.println(isBalanced("(()")); // should print false
        System.out.println(isBalanced("(")); // should print false
        System.out.println(isBalanced(")")); // should print false
        System.out.println(isBalanced("(()))")); // should print false
    }
        static boolean isBalanced(String s) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                    if (count < 0) {
                        return false;
                    }
                }
            }
            return count == 0;
        }
    }
