import java.util.Stack;
public class R227AI {
    public static void main(String[] args) {
        // Test the HTMLElements function with some sample inputs
        String[] testCases = {
                "<div><div><b></b></div></p>",
                "<div>abc</div><p><em><i>test test test</b></em></p>",
                "<div><b><p>hello world</p></b> </div>"
        };
        for (String testCase : testCases) {
            System.out.println(HTMLElements(testCase));
        }
    }

    public static String HTMLElements(String str) {
        // Create a stack to keep track of the HTML elements in the string
        Stack<String> stack = new Stack<String>();

        // Loop through the string and check each HTML element
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is the start of an HTML element
            if (str.charAt(i) == '<') {
                // Get the element name by reading the characters after the '<' until we reach a space or a '>'
                String elementName = "";
                i++;
                while (i < str.length() && str.charAt(i) != ' ' && str.charAt(i) != '>') {
                    elementName += str.charAt(i);
                    i++;
                }

                // Check if the element is a closing element (e.g. </div>) or a self-closing element (e.g. <br />)
                if (elementName.charAt(0) == '/') {
                    // If the element is a closing element, check if it matches the top element in the stack
                    if (stack.isEmpty() || !stack.pop().equals(elementName.substring(1))) {
                        // If the element does not match the top element in the stack, return the element name as the result
                        return elementName.substring(1);
                    }
                } else {
                    // If the element is not a closing element, add it to the stack
                    stack.push(elementName);
                }
            }
        }

        // If all the HTML elements are nested correctly, return the string "true"
        return "true";
    }
}
