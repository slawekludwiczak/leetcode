package remove_duplicates_from_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int next = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[next] != nums[i]) {
                next++;
                nums[next] = nums[i];
            }
        }
        return next + 1;
    }
}
