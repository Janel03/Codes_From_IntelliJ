package ReplsAI;
import java.util.Stack;
public class R215Ai {
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
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }


