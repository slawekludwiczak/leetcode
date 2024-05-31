package _26_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int i = 0;
        int j = 1;
        int k = 1;
        for (; i < nums.length && j < nums.length; i++) {
            int next = nums[i];
            for (; j < nums.length; j++) {
                if (nums[j] != next) {
                    nums [i + 1] = nums[j];
                    k++;
                    break;
                }
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
        return k;
    }
}