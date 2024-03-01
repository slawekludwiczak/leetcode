package _66_plus_one;

import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int transfer = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int next = digits[i];
            if (next + transfer == 10) {
                stack.push(0);
                transfer = 1;
            } else {
                stack.push(next + transfer);
                transfer = 0;
            }
        }
        if (transfer == 1) {
            stack.push(1);
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}