package _55_jump_game;

class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = i + nums[i] >= max?  i + nums[i] : max;
        }
        return true;
    }
}