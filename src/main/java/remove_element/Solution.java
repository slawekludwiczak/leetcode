package remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length - 1;
        int i = 0, repetitions = 0;
        for (; repetitions < nums.length; repetitions++) {
            if (nums[i] == val) {
                nums[i] = nums[lastIndex];
                nums[lastIndex] = 0;
                lastIndex--;
            } else {
                i++;
            }
        }
        return i;
    }
}
