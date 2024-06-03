package _189_rotate_array;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] partial = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        for (int i = nums.length - k - 1, j = 0; i >= 0; i--, j++) {
            nums[nums.length - j - 1] = nums[i];
        }
        System.arraycopy(partial, 0, nums, 0, partial.length);
    }

}