package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {


        Stack<Character> st = new Stack<>();
        //()[]{}
        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }


        }
        return st.isEmpty();

    }
}
