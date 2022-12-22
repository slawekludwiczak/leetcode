package valid_parentheses;

class SolutionOptimized {
    private final char[] openParentheses = {'(', '[', '{'};
    private final char[] closingParentheses = {')', ']', '}'};

    public boolean isValid(String s) {
        char[] stack = new char[s.length()/2+1];
        int size = 0;
        for (char nextChar : s.toCharArray()) {
            if (nextChar == openParentheses[0] || nextChar == openParentheses[1] || nextChar == openParentheses[2]) {
                stack[size] = nextChar;
                size++;
            } else if (size != 0) {
                char pop = stack[--size];
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

        return size == 0;
    }
}
