package valid_parentheses;

import java.util.Stack;

class Solution {
    private final char[] openParentheses = {'(', '[', '{'};
    private final char[] closingParentheses = {')', ']', '}'};

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char nextChar : s.toCharArray()) {
            if (nextChar == openParentheses[0] || nextChar == openParentheses[1] || nextChar == openParentheses[2]) {
                stack.push(nextChar);
            } else if (!stack.isEmpty()) {
                Character pop = stack.pop();
                if (nextChar == closingParentheses[0] && pop != openParentheses[0] ||
                        nextChar == closingParentheses[1] && pop != openParentheses[1] ||
                        nextChar == closingParentheses[2] && pop != openParentheses[2]
                ) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
