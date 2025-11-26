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
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                System.out.println(num);
            }
            else if (ch == '[') {
                numberStack.push(num);
                num = 0;
                stringStack.push(ch);  // push '[' to mark boundary
            }
            else if (ch != ']') {
                stringStack.push(ch);
            }
            else {
                // 1️⃣ Pop characters until '['
                StringBuilder temp = new StringBuilder();
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp.insert(0, stringStack.pop());

                }
                stringStack.pop();
                int repeat = numberStack.pop();
                String repeated = temp.toString().repeat(repeat);
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
