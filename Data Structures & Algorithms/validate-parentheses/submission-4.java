
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '[' || ch == '(' || ch == '{') {
                st.push(ch);
            }

            // Check closing brackets
            else if (!st.isEmpty() && ch == ']' && st.peek() == '[') {
                st.pop();
            }

            else if (!st.isEmpty() && ch == '}' && st.peek() == '{') {
                st.pop();
            }

            else if (!st.isEmpty() && ch == ')' && st.peek() == '(') {
                st.pop();
            }

            else {
                return false;
            }
        }

        return st.isEmpty();
    }
}