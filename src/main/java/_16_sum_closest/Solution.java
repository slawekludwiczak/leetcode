package _16_sum_closest;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDistance = Integer.MAX_VALUE;
        int minSum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int distance = Math.abs(sum - target);
                    if (distance < minDistance) {
                        minSum = sum;
                        minDistance = distance;
                    }
                }
            }
        }
        return minSum;
    }
}