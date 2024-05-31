package _80_remove_duplicates_from_sorted_array_ii;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                count = 0;
            } else {
                count++;
            }
            if (count == 1) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}