package Code_75;
import java.util.*;
public class DecodeString {

    public static void main(String[] args) {

        System.out.println(decodeString("3[a]2[bc]"));

    }
    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();

        int num = 0;

        for (char ch : s.toCharArray()) {

            // If it's a digit → build the number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                System.out.println(num);
            }
            // If we hit '[' → push the number and push '[' marker
            else if (ch == '[') {
                numberStack.push(num);
                num = 0;
                stringStack.push(ch);  // push '[' to mark boundary
            }
            // If we get anything except ']' → push character
            else if (ch != ']') {
                stringStack.push(ch);
            }
            // If we get ']' → start popping to decode
            else {
                // 1️⃣ Pop characters until '['
                StringBuilder temp = new StringBuilder();
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp.insert(0, stringStack.pop());
                }

                // Pop the '['
                stringStack.pop();

                // 2️⃣ Pop the repeat count
                int repeat = numberStack.pop();

                // 3️⃣ Build repeated string
                String repeated = temp.toString().repeat(repeat);

                // 4️⃣ Push result back to stringStack
                for (char c : repeated.toCharArray()) {
                    stringStack.push(c);
                }
            }
        }

        // Build final answer
        StringBuilder result = new StringBuilder();
        while (!stringStack.isEmpty()) {
            result.insert(0, stringStack.pop());
        }

        return result.toString();
    }
}
